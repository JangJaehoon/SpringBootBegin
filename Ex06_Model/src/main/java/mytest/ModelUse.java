package mytest;

import java.util.HashMap;
import java.util.Map;

public class ModelUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> model = new HashMap<>();
		String sReturn = root(model);
		printData(sReturn, model);
		
	}

	private static String root(Map<String, String> model) {
		// TODO Auto-generated method stub
		model.put("name1", "HongGilDong");
		model.put("name2", "JunUchi");
		
		return "Hello";
		// 사용자에게 보여줄 jsp이름 호출
	}
	
	private static void printData(String sReturn, Map<String, String> model) {
		// TODO Auto-generated method stub
		String str1 = (String)model.get("name1");
		System.out.println(str1);
		System.out.println("WEB-INF/views/" + sReturn + ".jsp");
	}

}
