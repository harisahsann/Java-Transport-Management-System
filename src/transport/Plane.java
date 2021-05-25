package transport;

public class Plane extends Travel implements BoardingPass {

	String type;
	int weight;
	int gateNumber;
	int convenceNumber;
	static final String ticketNumber;
	static final String seatNumber;
	static final String modeOfTravel;
	static {
		modeOfTravel = "Plane";
		ticketNumber = "PL-4532";
		seatNumber = "P001";
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

	@Override
	public void setWeight(int weight) {
		
		this.weight = weight;
	}

	@Override
	public void setGateNumber() {
		// TODO Auto-generated method stub
		gateNumber = 003;
	}

	@Override
	public void setConvenceNumber() {
		// TODO Auto-generated method stub
		convenceNumber = 6578;
	}

	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}

	@Override
	public int gateNumber() {
		// TODO Auto-generated method stub
		return gateNumber;
	}

	@Override
	public int ConvenceNumber() {
		// TODO Auto-generated method stub
		return convenceNumber;
	}

	
}
