
public class Laptop extends Machine{
	private String mark;
	
	public Laptop(String name,String mark){
		super(name);
		//name=super.name;
		this.mark=mark;	
	}
	public String getMark() {
		return mark;
	}	
	@Override
	public String toString() {
		return String.format("%s Mark : %s", super.toString(),getMark()) ;
	}
	

}
