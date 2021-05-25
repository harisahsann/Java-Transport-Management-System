package transport;

public class Bus extends Travel {

	String type;
	static final String ticketNumber;
	static final String seatNumber;
	static final String modeOfTravel;
	static {
		modeOfTravel = "Bus";
		ticketNumber = "BS-5676";
		seatNumber = "B001";
	}
	
	
	public String getSeatnumber() {
		return seatNumber;
	}

	public String getTicketnumber() {
		return ticketNumber;
	}

	public String getModeoftravel() {
		return modeOfTravel;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	
}
