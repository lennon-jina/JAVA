package ch11_java_api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class CoinMain {

	public static void main(String[] args) throws Exception, ParseException {
		Scanner scan = new Scanner(System.in);
		System.out.println("====== 코인 정보 시스템 입니다. ======");
		// 1. 코인 종목 코드 출력 (한줄에 5 ~ 7 개 정도 출력)
		
		
		while(true) {
			System.out.println("\n 어떤 종목을 보여드릴까요?(end:q)");
			String msg = scan.nextLine();
			String code = msg;
			if(msg.equalsIgnoreCase("q")) {
				System.out.println("====== 종료 ======");
				break;
			}
			JSONObject resultObj = getCoin(code);
			System.out.println(resultObj.get("trade_date") + "일 현재");
			DecimalFormat format = new DecimalFormat("#,###.##");
			System.out.println(format.format(resultObj.get("trade_price" + "원")));
			
			// 2. 해당 코인의 최저가(low), 최고가(high), 현재가(trade) 출력
			
			
			
		}
	
	}
	
	
	public static JSONObject getCoin(String code) throws IOException, ParseException {
		String detailUrl = "https://api.upbit.com/v1/ticker?markets=" + code;
		URL url = new URL(detailUrl);
		HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		int resCode = conn.getResponseCode();
		JSONObject obj = null;
		if(resCode == 200) {
			BufferedReader in =
					new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String inputLine;
			StringBuffer res = new StringBuffer();
			while((inputLine = in.readLine()) != null) {
				res.append(inputLine);
			}
			in.close();
			JSONParser parser = new JSONParser();
			JSONArray arr = (JSONArray) parser.parse(res.toString());
			obj = (JSONObject) arr.get(0);
		}
		return obj;
		
	}
}
