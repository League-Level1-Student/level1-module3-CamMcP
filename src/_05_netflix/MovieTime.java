package _05_netflix;

public class MovieTime {
public static void main(String[] args) {
	Movie Marvel = new Movie("Avengers: Endgame", 5);
	System.out.println(Marvel.getTicketPrice());
	NetflixQueue e = new NetflixQueue();
	e.addMovie(Marvel);
	e.printMovies();
	e.getBestMovie();
	e.getSecondBestMovie();
	Movie 
	
	
}
}
