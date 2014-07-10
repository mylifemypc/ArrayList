
public abstract class Machine{
	private String name;
	public Machine(String name){
		this.name=name;		
	}
	public String getName() {		
		return name;
	}
	public String toString(){
		return String.format("Name : %s", getName());		
	}
	
}
