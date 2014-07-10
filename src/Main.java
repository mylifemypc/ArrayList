import java.util.*;
public class Main {		

	public static void main(String[] args) {
		List<Machine> machines=new ArrayList<Machine>();
		Car c1 = new Car("Doblo",200);
		Car c2 = new Car("Þahin",100);
		Car c3 = new Car("Kartal",120);
		Laptop l1 =new Laptop("L1","Asus");
		Laptop l2 =new Laptop("L2","Dell");
		Laptop l3 =new Laptop("L3","Casper");
		
		machines.add(c1);
		machines.add(l1);
		machines.add(c2);
		machines.add(l2);
		machines.add(c3);
		machines.add(l3);
		System.out.println("*** For Döngüsünden önce ***");
		for(Machine mac : machines){
			System.out.println(mac);
			//mac.toString();
		}		
		System.out.println("*** For Döngüsünden sonra ***\n");
		
		System.out.println(c1.toString());
		System.out.println(l3.toString());
		
		
		
		
	}	
}
