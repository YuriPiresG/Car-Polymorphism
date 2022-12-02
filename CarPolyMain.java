
public class CarPolyMain {

	public static void main(String[] args) {
		CarPoly car = new CarPoly(8, "Base car");
		System.out.println(car.startEngine());
		System.out.println(car.accelerate());
		System.out.println(car.brake());
		
		McLaren mc = new McLaren(8,"McLaren");
		System.out.println(mc.startEngine());
		System.out.println(mc.accelerate());
		System.out.println(mc.brake());
		
		Fusca fc = new Fusca(8,"Fusca");
		System.out.println(fc.startEngine());
		System.out.println(fc.accelerate());
		System.out.println(fc.brake());
		
	}
}
