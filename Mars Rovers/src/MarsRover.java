import java.io.IOException;
import java.util.Scanner;

public class MarsRover {
    public static void main(String[] args) {
        String choice;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the top right corner coordinates of Plateau: (x y)");
            String coordinates = scanner.nextLine();
            Plateau plateau = new Plateau(coordinates);
            do {
                System.out.println("Enter the current position of the Rover: (x_coordinates y_coordinates direction_of_its_face)");
                String initialPosition = scanner.nextLine();
                Rover rover = new Rover(initialPosition);
                System.out.println("Enter the instructions for its movement: ((Left) L/ (Right) R/ (Jump Step) M)");
                String movement = scanner.nextLine();
                String finalPosition = rover.getFinalPosition(movement);
                System.out.println("Final Position of the Rover is :" + finalPosition);
                System.out.println("Do you have one more rover? (Y/N)");
                choice = scanner.nextLine();
            }while(choice.toUpperCase().equals("Y"));
        } catch (RoverException e) {
            System.out.println("Invalid Input !!! Please give proper inputs !!!");
        }

    }
}
