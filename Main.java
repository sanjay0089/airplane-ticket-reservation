package myfirstproject;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		ArrayList<Airplane> airplane=new ArrayList<Airplane>();
		ArrayList<passengers> pass=new ArrayList<passengers>();
		airplane.add(new Airplane(1,"sa",3));
		airplane.add(new Airplane(2,"s",2));
		airplane.add(new Airplane(3,"a",1));
		int userinp=1;
		Scanner sc=new Scanner(System.in);
		while(userinp==1) {
			System.out.println("Enter 1 for new booking and 2 for exit");
			userinp=sc.nextInt();
			if(userinp==1) {
				passengers p=new passengers();
				if(p.isavailable(airplane,pass)) {
					pass.add(p);
					System.out.println("booked...");
				}
				else {
					System.out.println("no seats available");
				}
			}
		}
	}
}
