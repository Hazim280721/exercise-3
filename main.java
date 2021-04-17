
public class main {
	public static void main(String[] args) {
		
		aeroplane boeing = new aeroplane();
		
		
		
		System.out.println("Model :"+boeing.model);
		System.out.println("Color :"+boeing.color);
		System.out.println("Seats :"+boeing.seat);
		System.out.println("Speed :"+boeing.speed+" Kn");
		System.out.println("Fuel Price :"+"RM "+boeing.fuel);
		System.out.println("Fly Range :"+boeing.range+" KM");
		System.out.println("Fly Time :"+boeing.time+" hours");
		System.out.println();
		
        aeroplane airbus = new aeroplane();
        
       
		System.out.println("Model :"+airbus.model);
		System.out.println("Color :"+airbus.color);
		System.out.println("Seats :"+airbus.seat);
		System.out.println("Speed :"+airbus.speed+" Kn");
		System.out.println("Fuel Price :"+"RM "+airbus.fuel);
		System.out.println("Fly Range :"+airbus.range+" KM");
		System.out.println("Fly Time :"+airbus.time+" hours");
		System.out.println();
	}


}
