package kadai_028;

import java.util.HashMap;

public class Jyanken_Chapter28 {
	
	
	public  String getMyChoice(String input) {
					
		if(input.equals("r")) {
			String inputOk = input;
			return inputOk;
			
		} else if(input.equals("s")) {
			String inputOk = input;
			return inputOk;
			
		} else if(input.equals("p")) {
			String inputOk = input;
			return inputOk;
			
		} else {
			String inputBad = "入力が正しくありません、もう一度入力してください";
			System.out.println(inputBad);
			return inputBad;
		}
		
	}
	
	
	public String getRandom() {
		
		String[] handArray = {"r","s","p"};
		
		int random =(int) Math.floor(Math.random() * 3);
		
		String randomHand = handArray[random];
		
		return randomHand;
	}
	

	public void playGame(String me,String pc) {
		
	HashMap <String,String> result = new HashMap<String,String>();
		
		result.put("r", "グー");
		result.put("s", "チョキ");
		result.put("p", "パー");
		
		String myHand = result.get(me);
		String pcHand = result.get(pc);
		

		System.out.println("自分の手は" + myHand);
		System.out.println("対戦相手の手は" + pcHand);
		
		if(myHand == pcHand) {
			System.out.println("あいこです");
		}else if((myHand == "グー" && pcHand == "チョキ") || (myHand == "チョキ" && pcHand == "パー") || (myHand == "パー" && pcHand == "グー")) {
			System.out.println("自分の勝ちです");
		}else if((myHand == "グー" && pcHand == "パー") || (myHand == "チョキ" && pcHand == "グー") || (myHand == "パー" && pcHand == "チョキ")) {
			System.out.println("自分の負けです");
		}
	}
}
