package practice_jn;

/**
 * class Name   : MemberService
 * Author       : JINA
 * Created Date : 2025. 2. 12.
 * version      : 1.0
 * Purpose      : java 확인문제
 * Description  : login, logout 메소드 선언
 */

public class MemberService {
	
	boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}

	void logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다.");
	}

}