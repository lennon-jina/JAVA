package ch15_inout;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.DatabaseMetaData;

/**
 * class Name   : FileBasic
 * Author       : JINA
 * Created Date : 2025. 2. 13.
 * version      : 1.0
 * Purpose      : java 기초
 * Description  : 파일 입출력 (문자단위)
 */

public class FileBasic {

	public static void main(String[] args) throws IOException {
		String path = System.getProperty("user.dir");
		// 현재 경로
		System.out.println(path);
		FileReader reader = null;
		FileWriter writer = null;
		
		// 파일을 문자 단위로 읽기 위한
		try {
			reader = new FileReader(path + "/delay.txt");
			writer = new FileWriter(path + "/delay_backup.txt");
			char [] data = new char[16];   // 한번에 16개 문자를 읽겠다. (기준 없음)
			while(true) {
				int x = reader.read(data);
				if( x == -1) {
					System.out.println("파일 끝에 도달");
					break;
				}
				writer.write(data, 0, x);    // data 배열의 0번째 인덱스부터 x만큼 파일에 쓰겠다.
			}
			writer.flush();   // 남아 있는게 없도록 비움.
			System.out.println("파일 쓰기 완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
				try {
					if(writer != null) writer.close();  // 꼭 쓰고 닫아줘야함.
					if(reader != null) reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
		}
	}
}
