
public class flight {
	 String flight_name;
	 String origin;
 String destination;
	 int flight_number;
	
	
	
	public flight(String flight_Name, String ori,String dest ,int flight_numb) {
		flight_name=flight_Name;
		origin = ori;
		destination=dest;
		flight_number=flight_numb;
	}
	
	public String get_flight_name() {
		return flight_name;
	}

	public void setflight_name (String flight_name1 ) {
		flight_name=flight_name1;
	}
	
	public String get_origin() {
		return origin;
	}

	public void setorigin(String origin1 ) {
		origin=origin1;
	}
	public String get_destination(){
		return destination;
	}

	public void setdestination(String destination1 ) {
		destination=destination1;
	}
	
	public int get_flight_number() {
		return flight_number;
	}

	public void setflight_number(int flight_number1 ) {
		flight_number=flight_number1;
	}
	 public String toString() {
		 return "flight information is :"+ get_flight_name() +" flight_number: "+ get_flight_number()+" origin " +get_origin() +" Destination is "+ get_destination() ;
	 }
	 
}
	
	
	
	
	
	