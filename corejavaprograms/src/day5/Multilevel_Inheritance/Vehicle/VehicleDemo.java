package day5.Multilevel_Inheritance.Vehicle;

public class VehicleDemo {

	public static void main(String[] args) {
		Car c;
		c=new Car();
		c.vehicleType();
		
		Rolls_Royce m=new Rolls_Royce();
		m.brand();
		m.speed();
		
		Rolls_Royce m1=new Rolls_Royce();
		m1.speed();

	}

}