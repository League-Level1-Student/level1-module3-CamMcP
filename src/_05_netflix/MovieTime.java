package _05_netflix;

public class MovieTime {
public static void main(String[] args) {
	Movie Marvel = new Movie("Avengers: Endgame", 5);
	System.out.println(Marvel.getTicketPrice());
	NetflixQueue e = new NetflixQueue();
	e.addMovie(Marvel);
	e.printMovies();
	Movie WalkSky = new Movie("Star Wars: Retutn of Skywalker", 4);
	System.out.println(WalkSky.getTicketPrice());
	e.addMovie(WalkSky);
	e.printMovies();
	Movie Ice = new Movie("Frozen II", 2);
	System.out.println(Ice.getTicketPrice());
	e.addMovie(Ice);
	e.printMovies();
	Movie The_Clown = new Movie("Joker", 5);
	System.out.println(The_Clown.getTicketPrice());
	e.addMovie(The_Clown);
	e.printMovies();
	Movie Far = new Movie("Spiderman: Far from Home", 5);
	System.out.println(Far.getTicketPrice());
	e.addMovie(Far);
	e.printMovies();
	Movie M = e.getBestMovie();
	Movie S = e.getSecondBestMovie();
	System.out.println("The best movie is " + M + "!");
	System.out.println("The second best movie is" + S + "!");
	
}
}
