package transport;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	
		try (Scanner scan = new Scanner(System.in)) {
			Challan c1=new Challan();
			
			System.out.println("Select Mode of Travel");
			System.out.print("1.Bus\n2.Train\n3.Plane\n");
			switch (scan.nextInt())
			{
			case 1 :
				Bus b1 = new Bus();
				System.out.println("Enter Name: ");
				b1.setName(scan.next());
				System.out.println("Enter Cnic No: ");
				b1.setCnic(scan.next());
				System.out.println("Enter Sourse: ");
				b1.setDepartureCity(scan.next());
				System.out.println("Enter Destination: ");
				b1.setArrivalCity(scan.next());
								
				
				c1.printChallan(b1);
				break;
			case 2 :
				Train t1 = new Train();
				System.out.println("Enter Name: ");
				t1.setName(scan.next());
				System.out.println("Enter Cnic No. : ");
				t1.setCnic(scan.next());
				System.out.println("Enter Sourse: ");
				t1.setDepartureCity(scan.next());
				System.out.println("Enter Destination: ");
				t1.setArrivalCity(scan.next());
				System.out.println("Enter luggage weight: ");
				t1.setWeight(scan.nextInt());
				
				c1.printChallan(t1);
				c1.printBoardingPass(t1);
				break;
			case 3 :
				Plane p1 = new Plane();
				System.out.println("Enter Name: ");
				p1.setName(scan.next());
				System.out.println("Enter Cnic No: ");
				p1.setCnic(scan.next());
				System.out.println("Enter Sourse: ");
				p1.setDepartureCity(scan.next());
				System.out.println("Enter Destination: ");
				p1.setArrivalCity(scan.next());
				System.out.println("Enter luggage weight: ");
				p1.setWeight(scan.nextInt());
				
				c1.printChallan(p1);
				c1.printBoardingPass(p1);
				break;
			}
		}
		
		

	}

}
