package kadai_021;

import java.util.HashMap;


public class Dictionary_Chapter21 {
	
	public void kensaku(String[] arr) {
		
	HashMap<String,String> dictionary = new HashMap<String,String>();
	
	dictionary.put("apple","りんご");
	dictionary.put("peach","桃");
	dictionary.put("banana","バナナ");
	dictionary.put("lemon","レモン");
	dictionary.put("pear","梨");
	dictionary.put("kiwi","キウィ");
	dictionary.put("strawberry","いちご");
	dictionary.put("grape","ぶどう");
	dictionary.put("muscat","マスカット");
	dictionary.put("cherry","さくらんぼ");
	
	
		 
	for(String searchValue : arr) {
		if( dictionary.get(searchValue) == null ) {
			System.out.println(searchValue + "は辞書に存在しません");
		} else {
			System.out.println(searchValue + "の意味は" + dictionary.get(searchValue));
		}
		
	}
	 }
}

	
	
	

