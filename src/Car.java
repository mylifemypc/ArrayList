
public class Car extends Machine{
	private double speed;
	//private String name;
	
	public Car(String name,double speed){
		super(name);
		this.speed=speed;		
	}
	public double getSpeed() {
		return speed;
	}
	@Override
	public String toString() {
		return String.format("%s Speed :%.2f", super.toString(),getSpeed());
	}
	
	
	
}
