package myfirstproject;
import java.util.*;
public class Airport {
	private String place;
	private String name;
	Airport(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the airport place");
		place=sc.nextLine();
		System.out.println("Enter the airport name");
		name=sc.nextLine();
	}
	public void setplace(String place) {
		this.place=place;
	}
	public String getplace() {
		return place;
	}
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
}
