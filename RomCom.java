//Karin Cota-Robles 12/14/15
public class RomCom extends Movie {
	private int jerks;
	private int friendzones;
	public RomCom(String title, int year, int duration, double rating, int newjerks, int newfriendzones) {
		super(title,year,duration,rating);
		if (newjerks>=1 && newjerks<=10) {
			jerks = newjerks;
		} else {
			throw new IllegalArgumentException("number of jerks must be between 1 and 10");
		}
		if (newfriendzones>=1 && newfriendzones<=10) {
			friendzones = newfriendzones;
		} else {
			throw new IllegalArgumentException("number of friendzones must be between 1 and 10");
		}
	}
	public String toString() {
		super.price = ((jerks + friendzones + year - duration)/100);
		String summary = super.toString() + String.format("jerks: %2d, friendzones: %2d", jerks, friendzones);
		return summary;
	}
	public double getPrice() {
		return ((jerks + friendzones + year - duration) / 100);
	}
}
