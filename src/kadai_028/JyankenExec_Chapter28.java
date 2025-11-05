package kadai_028;

import java.util.Scanner;

public class JyankenExec_Chapter28 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Jyanken_Chapter28 jyanken = new Jyanken_Chapter28();
		
		System.out.println("自分のじゃんけんの手を入力しましょう\n"
				+ "グーはrockのrを入力しましょう\n"
				+ "チョキはscissorsのsを入力しましょう\n"
				+ "パーはpaperのpを入力しましょう");
		
		Scanner scanner = new Scanner(System.in);
		
		String inputDo = scanner.next();
		
		scanner.close();
		
		String me2 = jyanken.getMyChoice(inputDo);
		
		String pc2 = jyanken.getRandom();
		
		
		jyanken.playGame(me2,pc2);
	}

}
