//Karin Cota-Robles 12/14/15
public class Action extends Movie {
	private int explosions;
	public int getExplosions() {
		return explosions;
	}
	public void setExplosions(int newexplosions) {
		explosions = newexplosions;
	}
	public Action(String title, int year, int duration, double rating, int newexplosions) {
		super(title,year,duration,rating);
		if (newexplosions>=1 && newexplosions<=100) {
			explosions = newexplosions;
		} else {
			throw new IllegalArgumentException("number of explosions must be between 1 and 100");
		}
	}
	public String toString() {
		super.price = ((year + explosions * duration)/1000);
		String summary = super.toString() + String.format("explosions: %3d", explosions);
		return summary;
	}
	public double getPrice() {
		return ((year + explosions * duration) / 1000);
	}
}
