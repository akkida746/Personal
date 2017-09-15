import java.util.HashMap;

public class ParkingLot {
	
	private static HashMap<ParkingSpace,Vehical> map = new HashMap<ParkingSpace,Vehical>();
	
	public static void main(String... args){
		
		Vehical vehical = new Vehical("UP23S1648");
		ParkingSpace ps = new ParkingSpace(1,"123");
		map.put(ps,vehical);
		
		Vehical vehical1 = new Vehical("UP2Scfegvdv");
		ParkingSpace ps1 = new ParkingSpace(1,"1234");
		map.put(ps1,vehical1);
		
		System.out.println(map.get(ps).num);
		System.out.println(map.get(ps1).num);
	}

}

class Vehical{
	public String num;
	Vehical(String num){
		this.num = num;
	}
}

class Car extends Vehical{
	Car(String num){
		super(num);
	}
	
	public String toString(){
		return num;
	}
}

class ParkingSpace{
	String parkingNum;
	int level;
	
	ParkingSpace(int level, String parkingNum){
		this.level = level;
		this.parkingNum = parkingNum;
	}
}