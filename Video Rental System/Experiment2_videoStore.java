package Lecture1;
import java.util.ArrayList;
import java.util.Scanner;
public class Experiment2_videoStore {
	static ArrayList<Experiment2_Video> list = new ArrayList<>();
	static Scanner hh = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Welcome to the Ketan's store");
		System.out.println("------------------------");
		System.out.println("Press 1 Add the video"); // 18BET1071_Ketan
		System.out.println("Press 2 Check out video");
		System.out.println("Press 3 Return the video");
		System.out.println("Press 4 Add rating to video");
		System.out.println("Press 5 Check availble videos in the inventory");
		System.out.println("Press 0 for Exit store");
		int x;
		do {
		x = hh.nextInt();
		switch(x) {
		case 1: {
			Add();
			break;
		}
		case 2: {
			Checking();
			break;
		}
		case 3: {
			Reciving();
			break;
		}
		case 4: {
			Rating();
			break;
		}
		case 5: {
			Show();
			break;
		}
		case 0: {
			System.out.println("Bye - Bye (Thanks for visit)");
			break;
		}
		default: {
			System.out.println("Enter the valid operation");
		}
		}
		} while(x != 0);
	}
	
	static void Add() {
		System.out.println("Enter the title of the video");
		hh.nextLine();
		String ch = hh.nextLine();
		Experiment2_Video  vid = new Experiment2_Video(ch);
		list.add(vid);
		System.out.println("Added SucessFully");
	}
	
	static void Checking() {
		System.out.println("Enter the video title which you want checked");
		hh.nextLine();
		String ch = hh.nextLine();
		for(Experiment2_Video i: list) {
			if(ch.equalsIgnoreCase(i.display())) {
				if(!(i.Check())) {
					System.out.println(i.display()+" is checked");
					i.Checking();
				}
				else {
					System.out.println(i.display()+" is already checked");
				}
				return;
			}
		}
		System.out.println(ch +"is not present in the store");
	}	
	static void Reciving() {
		System.out.println("Enter the title of video which you want to return");
		hh.nextLine();
		String ch = hh.nextLine();
		for(Experiment2_Video i: list) {
			if(ch.equalsIgnoreCase(i.display())) {
				if(i.Check()) {
					System.out.println(i.display()+" is recieved");
					i.Checking();
				}
				else {
					System.out.println(i.display()+" is already present");
				}
				return;
			}
		}
		System.out.println("There is no record found for "+ ch +" in the store");
	}
	
	
	
	static void Rating() {
		System.out.println("Enter the title of video for which you want to provide the Rating");
		hh.nextLine();
		String ch = hh.nextLine();
		for(Experiment2_Video i: list) {
			if(ch.equalsIgnoreCase(i.display())) {
				System.out.println("enter the rating from 1 to 10");
				double range = hh.nextInt();
				if(range > 0 && range <= 10) {
					range += i.Return();
					i.people_increment();
					range /= i.people_no();
					i.updateRating(range);
				}
				else {
					System.out.println("invalid range input try again");
				}
				System.out.println("Average rating: "+i.Return());
				return;
			}
		}
		System.out.println("There is no record found for "+ ch +" in the store");
	}
	
	static void Show() {
		System.out.println("List of video currently present in the store");
		for(Experiment2_Video i: list) {
			if(!(i.Check()))
			System.out.println(i.display());
		}
	}

	
	
}