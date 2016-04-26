package House;

import java.util.HashMap;

public class Commercial extends HouseType{
	private double outdoorArea;
	private double parking;
	private int exterior;
	private int heatType;
	private int centralAir;
	private int interior;
	
	/*
	 * initialize the commercial or hotel with each attributes getting the value 
	 */
	public Commercial(HashMap<String, String> map){
		key = map.get("Parcel Number");
		type = map.get("Category Code Description");
		
		owner = map.get("Owner 1");
		streetName = map.get("Street Name");
		houseNumber = map.get("House Number");
		unit = map.get("Unit");
		livingArea = Double.parseDouble(map.get("Total Livable Area"));
		zipCode = map.get("Zip Code");
		buildYear = Integer.parseInt(map.get("Year Built"));
		
		salePrice = Double.parseDouble(map.get("Sale Price"));
		saleDate = map.get("Sale Date");
		marketValue = Double.parseDouble(map.get("Market Value"));
		marketDate = map.get("Market Value Date");
		
		location = new Coordinate(map.get("Coordinates"));
		outdoorArea = Double.parseDouble(map.get("Total Area"));
		parking = Double.parseDouble(map.get("parking"));
		exterior = Integer.parseInt(map.get("Exterior Condition"));
		heatType = Integer.parseInt(map.get("heatType"));
		centralAir = Integer.parseInt(map.get("Central Air"));
		interior = Integer.parseInt(map.get("Interior Condition"));
		
		
	}
	
	/*
	 * this method returns the outdoor area
	 */
	public double getOutdoorArea(){
		return outdoorArea;
	}
	
	/*
	 * this method gets the parking coefficient
	 */
	public double getParking(){
		return parking;
	}
	
	/*
	 * this method gets the exterior quality
	 */
	public int getExterior(){
		return exterior;
	}
	
	/*
	 * this method gets the heat type
	 */
	public int getHeatType(){
		return heatType;
	}
	
	/*
	 * this method gets whether there is central air condition
	 */
	public int getCentralAir(){
		return centralAir;
	}

	/*
	 * this method gets the interior quality
	 */
	public int getInterior(){
		return interior;
	}
	
	
}