package kadai_015;

public class Car_Chapter15 {
	
	//フィールド
	private int gear  = 1;
	private int speed = 10;
	
	
	//メソッド
	public void gearChange( final int afterGear) {
		
		int gear = this.gear;
		
		switch (afterGear) {
		case 1 -> this.speed = 10;
		case 2 -> this.speed = 20;
		case 3 -> this.speed = 30;
		case 4 -> this.speed = 40;
		case 5 -> this.speed = 50;
		default -> this.speed = 10;
		}
		
		System.out.println("ギア" + this.gear + "から" + afterGear +"に切り替えました");
		}
		
	public void speed( final int run) {
		
		System.out.println("速度は" + this.speed +"kmです");
		
		
	}
}
