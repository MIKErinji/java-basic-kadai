package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		
		KatoTaro_Chapter18 KatoTaro = new KatoTaro_Chapter18();
		KatoIchiro_Chapter18 KatoIchro = new KatoIchiro_Chapter18();
		KatoHanako_Chapter18 KatoHanako = new KatoHanako_Chapter18();
		
		KatoTaro.setGivenName("太朗");
		KatoIchro.setGivenName("一郎");
		KatoHanako.setGivenName("花子");
		
		KatoTaro.commonIntroduce();
		KatoIchro.commonIntroduce();
		KatoHanako.commonIntroduce();
		
		

	}

}
