//Karin Cota-Robles 12/14/15
import java.util.ArrayList;
import java.util.Collections;
public class Inventory {
	ArrayList<Movie> list = new ArrayList<>();
	public void add(Movie newmovie) {
		if (list.contains(newmovie)) {
			throw new MovieInventoryException(newmovie.title);
		} else {
			list.add(newmovie);
		}
		Collections.sort(list);
	}
	public boolean remove(String title, int year) {
		boolean a = false;
		for (int i = 0; i<list.size();i++) {
			if (list.get(i).title == title && list.get(i).year == year) {
				list.remove(i);
				a = true;
			} 
		}
		Collections.sort(list);
		return a;
	}
	public boolean contains(String title, int year) {
		boolean a = false;
		for (int i = 0; i<list.size();i++) {
			if (list.get(i).title == title && list.get(i).year == year) {
				a = true;
			}
		}
		return a;
	}
	public int size() {
		return list.size();
	}
	public String toString() {
		String movies = "";
		for (int i = 0; i<list.size(); i++) {
			movies += list.get(i).toString();
			movies += "\n";
		}
		return movies;
	}
	
}
