package myfirstproject;
import java.util.*;
public class Airplane {
	private int no;
	private String name;
	private int capacity;
	Airplane(int no,String name,int capacity){
		this.no=no;
		this.name=name;
		this.capacity=capacity;
	}
	public void setno(int n) {
		this.no=n;
	}
	public int getno(){
		return no;
	}
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	public void setcapacity(int n) {
		this.capacity=n;
	}
	public int getcapacity() {
		return capacity;
	}
}
