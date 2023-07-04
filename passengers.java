package myfirstproject;
import java.util.*;
public class passengers {
	String name;
	private int no;
	Airport airport;
	passengers(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		this.name=sc.nextLine();
		System.out.println("Enter the plane no");
		this.no=sc.nextInt();
		System.out.println("Enter the airport details");
		airport=new Airport();
	}
	boolean isavailable(ArrayList<Airplane> airplane,ArrayList<passengers>pass) {
		int temp=0;
		for(Airplane a:airplane) {
			if(a.getno()==no) {
				temp=a.getcapacity();
			}
		}
		int booked=0;
		for(passengers ps:pass) {
			if(ps.no==no) {
				booked++;
			}
		}
		return booked<temp?true:false;
	}
}
