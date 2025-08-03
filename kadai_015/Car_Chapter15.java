package kadai;

public class Car_Chapter15 {
	
	private int gear;
	private int speed;
	
	public Car_Chapter15() {
		this.gear = 1;
		this.speed = 10;
	}
	
	public void changeGear(int afterGear) {
		int beforeGear = this.gear;
		this.gear = afterGear;
		this.speed = switch(afterGear) {
		  case 1 -> 10;
		  case 2 -> 20;
		  case 3 -> 30;
		  case 4 -> 40;
		  case 5 -> 50;
		  default -> 10;
		};
		
		System.out.println("ギア" + beforeGear + "から" + afterGear + "に切り替えました");
	}
	
	public void run() {
		System.out.println("速度は時速" + speed + "kmです");
	}

}
