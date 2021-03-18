package exercise7;

public class WeightOnMars {
	double mass;

	public WeightOnMars(double mass) {
		this.mass = mass;
	}

	void setMass(double mass) {
		this.mass = mass;
	}

	public void calculateWeight() {
		double weightOnEarth = mass * 9.807;
		double weightOnMars = mass * 3.711;

		System.out.println("Mass: " + mass + "kg");
		System.out.println("Weight on Earth: " + weightOnEarth + "N");
		System.out.println("Weight on Mars: " + weightOnMars + "N\n");
	}
}