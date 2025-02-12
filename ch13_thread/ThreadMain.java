package ch13_thread;

public class ThreadMain {
	
	public static void main(String[] args) {
		System.out.println("main start");
		ExThread job1 = new ExThread(20, "job1");
		job1.start();   // run 메소드 실행
		ExThread job2 = new ExThread(100, "job2");
		job2.start();
		
		// 2. Runnable 인터페이스 구현 클래스 사용
		ExRunnable exRun1 = new ExRunnable(300, "job3");
		Thread job3 = new Thread(exRun1);
		job3.start();
		System.out.println("main end");
		
		// 3. 람다식 사용(익명함수)
		Thread job4 = new Thread(()->{
			int num = 600;
			for(int i = num; i <= num + 5; i++ ) {
				System.out.println("job4 " + i);
				// 시간차를 두기 위해
				try {
					Thread.sleep(500);  // 0.5초 딜레이
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		job4.start();
	}
	public static void print(int num) {
		for(int i = num; i <= num + 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
