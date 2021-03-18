package exercise7;

public class WeightOnMars {
	double mass;
	
	public WeightOnMars(double mass){
		this.mass = mass;
	}
	
	void setMass(double mass) {
		this.mass = mass;
	}
	
	public void calculateWeight() {
		double weightOnEarth = mass * 9.80665;
		double weightOnMars = mass * 3.711;

		System.out.println("Mass: "+ mass +"kg\nWeight on Earth: " + weightOnEarth +"N\nWeight on Mars: "+ weightOnMars +"N");
		System.out.println("Mass: "+ mass +"kg\nWeight on Earth: " + weightOnEarth +"N\nWeight on Mars: "+ weightOnMars +"N\n");
	}
}