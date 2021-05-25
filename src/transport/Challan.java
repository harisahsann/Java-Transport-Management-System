package transport;

public class Challan {
	
	public void printChallan(Travel b1) {
		System.out.println("Name of Passenger : "+b1.getName());
		System.out.println("Cnic of Passenger : "+b1.getCnic());
		System.out.println("Ticket Number : "+b1.getTicketnumber());
		System.out.println("Seat Number : "+b1.getSeatnumber());
		System.out.println("Departure City : "+b1.getDepartureCity());
		System.out.println("Arrival City : "+b1.getArrivalCity());
		System.out.println("Date : "+b1.getDate());
		System.out.println("Mode of Travel : "+b1.getModeoftravel());
		
	}
	public void printBoardingPass(BoardingPass b1)
	{
		System.out.println("Boarding Pass");
		System.out.println("Weight of Luggage : "+b1.getWeight());
		System.out.println("Gate Number : "+b1.gateNumber());
		System.out.println("Convence Number : "+b1.ConvenceNumber());
	}
}
