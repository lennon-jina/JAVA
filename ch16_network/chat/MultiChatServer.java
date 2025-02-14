package ch16_network.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MultiChatServer {
	
	// 접속 클라이언트 관리 배열
	private ArrayList<Client> clientList = new ArrayList<>();
 
	public static void main(String[] args) {
		
	}
	
	public void serverStart() {
		try {
			ServerSocket server = null;
			System.out.println("5000포트 서버 오픈!");
			while(true) {
				Socket soc = server.accept();   // 접속대기
				System.out.println("요청 수락!");
				System.out.println(soc.getRemoteSocketAddress());   // 접속자 IP
				Client client = new Client(soc);
				client.start();           // 접속자 1개 스레도 시작!
				clientList.add(client);   // 해당 서버 참여 접속자
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	// 여러 접속 클라이언트에게 메세지를 전해주기 위한 클래스
	public class Client extends Thread {
		Socket soc;
		PrintWriter writer;
		String name;
		
		public Client(Socket soc) {
			this.soc = soc;
			try {
				writer = new PrintWriter(soc.getOutputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// 접속 클라이언트 모두에게 메세지 전송
		public void sendAll(String msg) {
			for(int i = 0; i < clientList.size(); i++) {
				clientList.get(i).writer.println(msg);
				clientList.get(i).writer.flush();
			}
		}
		@Override
		public void run() {
			// 접속시 접속 정보를 다른 접속자들에게 알림
		try {	
			BufferedReader reader = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			name = reader.readLine();   // 입장시 닉네임을 전달 받음.
			sendAll(name + " 님이 입장하셨습니다.");
			while(true) {
				String msg = reader.readLine();
				if(msg == null || msg.isEmpty()) {
					break;
				}
				sendAll(msg);   // 전체에게 메세지 전송
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			sendAll(name + "님이 퇴장하셨습니다.");
			clientList.remove(this);
			try { if(soc != null) soc.close(); } catch (IOException e) {}
			}
		}
		
	}
}
