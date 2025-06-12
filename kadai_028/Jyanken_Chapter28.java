package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	public String getMyChoice() {
		
		//スキャナーで出力
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		String hand = scanner.next();
		
		if (hand.equals("r")|| hand.equals("s") || hand.equals("p")) {
			return hand;
		} else {
			System.out.println("エラー：r, s, p のいずれかを入力してください。");
		}
			
		}
	}
	
	
	public String getRandom() {
		
		String[] jyankenList = { "r", "s", "p"};
		
		String jyanken = jyankenList[(int) Math.floor(Math.random() * 3)];
		return jyanken;
		
		
	}

	public void playGame(String hand, String jyanken){
		HashMap<String,String>jyankens = new HashMap <String,String>();
		
		jyankens.put("r","グー");
		jyankens.put("s","チョキ");
		jyankens.put("p","パー");
		
		System.out.println("自分の手は" + jyankens.get(hand) + ",相手の手は" + jyankens.get(jyanken));
		
		if(hand.equals(jyanken)) {
			System.out.println("あいこです");
		}else if((hand.equals("r") && jyanken.equals("s")) ||
		(hand.equals("s") && jyanken.equals("p")) || 
		(hand.equals("p") && jyanken.equals("r"))){
			System.out.println("自分の勝ちです");
		}else {
			System.out.println("自分の負けです");
		}
	}
}
