import java.util.Scanner;

public class MovieDriverTask2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Movie movie = new Movie();

		char answer;

		do {

			System.out.println("Enter the name of a movie");
			movie.setTitle(scanner.nextLine());

			System.out.println("Enter the rating of the movie");
			movie.setRating(scanner.next());

			System.out.println("Enter the number of tickets sold for this movie");
			movie.setSoldTickets(scanner.nextInt());

			System.out.println(movie.toString());

			System.out.println("Do you want to enter another? (y or n)");
			answer = scanner.next().charAt(0);
			scanner.nextLine();

		} while (answer == 'y');
		
		System.out.println("Goodbye");
		
		scanner.close();

	}

}
