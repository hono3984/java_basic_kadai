package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		
		 KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
		 KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
		 KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
		 
		 ichiro.setGivenName();
		 taro.setGivenName();
		 hanako.setGivenName();
		
		 ichiro.execIntroduce();
		 taro.execIntroduce();
		 hanako.execIntroduce();
	}

}
