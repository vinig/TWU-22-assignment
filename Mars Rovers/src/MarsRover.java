import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MarsRover {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the top right corner coordinates of Plateau: (x y)");
        String coordinates = reader.readLine();
        Plateau plateau = new Plateau(coordinates);
        System.out.println("Enter the current position of the Rover: (x_coordinates y_coordinates direction_of_its_face)");
        String initialPosition = reader.readLine();
        Rover rover = new Rover(initialPosition);
        System.out.println("Enter the instructions for its movement: ((Left) L/ (Right) R/ (Jump Step) M)");
        String movement = reader.readLine();
        String finalPosition = rover.getFinalPosition(movement);
        System.out.println("Final Position of the Rover is :" + finalPosition);
    }
}
