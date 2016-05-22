//Karin Cota-Robles 12/14/15
public abstract class Movie implements Comparable<Movie>{
	protected double rating;
	public double getRating() {
		return rating;
	}
	public void setRating(double newrating) throws IllegalArgumentException {
		if (newrating>=0.0 && newrating<=4.0) {
			rating = newrating;
		} else {
			throw new IllegalArgumentException("rating cannot be less than 0 or greater than 4");
		} 
	}
	protected final int year;
	protected final int duration;
	protected final String title;
	public int getYear() {
		return year;
	}
	public int getDuration() {
		return duration;
	}
	public String getTitle() {
		return title;
	}
	public Movie(String newtitle, int newyear, int newduration, double newrating) {
		title = newtitle;
		if(newyear<=2015 && newyear>=1870) {
			year = newyear;
		} else {
			throw new IllegalArgumentException("year must be between 1870 and 2015");
		}
		if(newduration>=0) {
			duration = newduration;
		} else {
			throw new IllegalArgumentException("duration must be positive");
		}
		if(newrating>=0.0 && newrating<=4.0) {
			rating = newrating;
		} else {
			throw new IllegalArgumentException("rating cannot be less than 0 or greater than 4");
		}
	}
	protected double price;
	public String toString() {
		String summary = String.format("%s: %4d, rating: %3.1f, price: %5.2f", title, year, rating, price);
		return summary;
	}
	public abstract double getPrice();
	public int compareTo(Movie mov) {
		if (mov.year < this.year) {
			return 1;
		} else if (mov.year == this.year) {
			if (mov.rating < this.rating) {
				return 1;
			} else if (mov.rating == this.rating) {
				return 0;
			} else {
				return -1;
			}
		} else {
			return -1;
		}
	}

}
