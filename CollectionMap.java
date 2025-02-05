package ch08_collection;


import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;



/**
 * class Name   : CollectionMap
 * Author       : JINA
 * Created Date : 2025. 2. 5.
 * version      : 1.0
 * Purpose      : java 기초
 * Description  : Map
 */

public class CollectionMap {
	
	public static void main(String[] args) {
		// Map 가장 많이 사용 데이터 구조 중 하나
		// Key와 Value 한쌍인 데이터
		HashMap<String, String> stuMap = new HashMap<>();
		// <key 문자열, value 문자열>
		stuMap.put("첫째", "길동");
		stuMap.put("둘째", "동길");
		stuMap.put("셋째", "길수");
		System.out.println(stuMap);
		System.out.println(stuMap.get("둘째"));   // key로 value 가져오기
		stuMap.put("둘째", "동수");   // 동일 key이면 수정이 됨. key는 유니크함.
		System.out.println(stuMap.size());   // 순서는 보장하지 않지만 사이즈는 가져옴.
		System.out.println(stuMap.containsKey("첫째"));    // 해당 key가 있으면 true 없으면 false
		System.out.println(stuMap.containsValue("동길"));  // 해당 value가 있으면 true 없으면 false
		
		// map은 keySet으로 for문 사용
		Set<String> keys = stuMap.keySet();  // 키 정보만 변환
		System.out.println(keys);
		for(String key : keys) {
			System.out.println(stuMap.get(key));
		}
		// entrySet 사용 for문
		Set<Entry<String, String>> entrySet = stuMap.entrySet();
		for(Entry<String, String> entry: entrySet) {
			String key = entry.getKey();
			String value = entry.getKey();
			System.out.println(key + ":" + value);
		}
		
		HashMap<String, Integer> coinMap = new HashMap<>();
		coinMap.put("비트코인", 142872834);
		coinMap.put("이더리움", 3468439);
		
		for(String coin: coinMap.keySet()) {
			System.out.println(coin + ":" + coinMap.get(coin));
		}
	}
}
