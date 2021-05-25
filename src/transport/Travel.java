package transport;
import java.time.LocalDate;

public abstract class Travel {

	private String name;
	private String cnic;
	
	private String departureCity;
	private String arrivalCity;
	LocalDate date = LocalDate.now();
	
	
	
	public LocalDate getDate() {
		return date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCnic() {
		return cnic;
	}
	public void setCnic(String cnic) {
		this.cnic = cnic;
	}
	public String getDepartureCity() {
		return departureCity;
	}
	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}
	public String getArrivalCity() {
		return arrivalCity;
	}
	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	
	public abstract void setType(String type);
	public abstract String getModeoftravel();
	public abstract String getSeatnumber();
	public abstract String getTicketnumber();
}
