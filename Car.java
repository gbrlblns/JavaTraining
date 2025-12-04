package OutputName;

public class Car {
	
	

	private String carPlate;
	private String carBrand;
	private String carModel;
	private String carColor;
	private String carType;
	
	public Car() {
		
		this.carPlate = "XYZ123";
		this.carBrand = "HYUNDAI";
		this.carModel = "CRETA";
		this.carColor = "BLACK";
					
	}
	
	public Car(String carPlate, String carBrand, String carModel, String carColor) {
		
		this.carPlate = carPlate;
		this.carBrand = carBrand;
		this.carModel = carModel;
		this.carColor = carColor;
		
					
	}
	
	public String getPlate() {
		return carPlate;
	}
	
	public String getBrand() {
		return carBrand;
	}
	
	public String getModel() {
		return carModel;
	}
	
	public String getColor() {
		return carColor;
	}
	
	
	
	public void setPlate(String carPlate) {
		this.carPlate = carPlate;
	}
	
	public void setBrand(String carBrand) {
		this.carBrand = carBrand;
	}
	
	public void setModel(String carModel) {
		this.carModel = carModel;
	}
	
	public void setColor(String carColor) {
		this.carColor = carColor;
	}
	
	

	public void cartype() {
		
		carType = "You are requesting vehicle information for Plate No: " + carPlate + 
				  "*** Brand : " + carBrand + " Model: " + carModel + " Color: " + carColor; 
		
		System.out.println(carType);
	}
	
}
