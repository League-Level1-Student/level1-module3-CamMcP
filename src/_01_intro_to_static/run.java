package _01_intro_to_static;

import javax.swing.JOptionPane;

public class run {

	    static int nextBibNumber;
	    static String raceLocation = "New York";
	    static String raceStartTime = "9.00am";

	    String name;
	    int speed;
	    int bibNumber;

	    run (String name, int speed){
	        this.name = name;
	        this.speed = speed;
	    }

	    public static void main(String[] args) {
	        run One = new run("John", 10);
	        run Two = new run ("Bill", 9);
	        One.bibNumber = 10;
	        Two.bibNumber = 54;
	        System.out.println(One.name);
	        System.out.println(One.bibNumber);
	        System.out.println(Two.name);
	        System.out.println(Two.bibNumber);
	        System.out.println(raceLocation);
	        //print their names, bibNumbers, and the location of their race. 
	    }
	}

