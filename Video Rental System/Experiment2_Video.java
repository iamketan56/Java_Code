package Lecture1;
public class Experiment2_Video {
	private String title;
	private boolean checked = false ;
	private double userRating = 0;
	private int people = 0;
	Experiment2_Video(String title) {
		this.title = title;
	}
	boolean Check() {
		return checked;
	}
	void Checking() {
		checked = !checked;
	}
	double Return() {
		return userRating;
	}
	int people_no() {
		return people;
	}
	void people_increment() {
		people++;
	}
	String display() {
		return title;
	}
	void updateRating(double i) {
		userRating = i;
	}
}
