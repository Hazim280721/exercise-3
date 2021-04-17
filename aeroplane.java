
import java.util.Scanner;
public class aeroplane {
String model;
String color;
int seat;
int speed;
int fuel;
int range;
double time;

Scanner s=new Scanner(System.in);

aeroplane(){


	System.out.println("Enter models: ");
	this.model=s.nextLine();

	System.out.println("Enter color: ");
	this.color=s.nextLine();
	
    System.out.println("Enter seat: ");	
	this.seat=s.nextInt();
	
    System.out.println("Enter speed: ");	
	this.speed=s.nextInt();
	
	System.out.println("Enter fuel Capacity: ");	
	this.fuel=s.nextInt();
	this.range=30*this.fuel;
	time=0.05*this.fuel;
	fuel=2*fuel;
	
}

aeroplane(String model, String color, int seat, int speed, int fuel, double time){

	 this.model=model;
     this.color=color;
     this.seat=seat;
     this.speed=speed;
     this.fuel=fuel;
     this.time=time;
}


}