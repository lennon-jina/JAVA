package ch15_inout;

import java.io.File;

/**
 * class Name   : FileDelete
 * Author       : JINA
 * Created Date : 2025. 2. 13.
 * version      : 1.0
 * Purpose      : java 기초
 * Description  : 파일 삭제
 */
public class FileDelete {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		String deletePath = path + "\\delay.txt";
		File file = new File(deletePath);
		// 해당 파일이 존재하면 true
		if(file.exists()) {
			// 파일 삭제를 성공하면 true
			if(file.delete()) {
				System.out.println("파일이 성공적으로 삭제 되었습니다." + deletePath);
			} else {
				System.out.println("파일이 존재하지 않습니다. 확인하세요:" + deletePath);
			}
		}
	}
}
