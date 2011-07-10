import org.junit.Test;

import static junit.framework.Assert.assertTrue;

public class MarsRoverTest {

    Plateau plateau;

    public MarsRoverTest() {
        plateau = new Plateau("5 5");
    }

    @Test
    public void shouldReturnCoordinatesOfPlateauAsFiveAndFive(){
        int xCoordinate = Plateau.getXCoordinate();
        int yCoordinate = Plateau.getYCoordinate();
        assertTrue(xCoordinate == 5);
        assertTrue(yCoordinate==5);
    }

    @Test
    public void shouldInitializePositionOfRoverToOneTwoNorth(){
        Rover rover = new Rover("1 2 N");
        int xCoordinate = rover.getXCoordinate();
        int yCoordinate = rover.getYCoordinate();
        String roverDirection = rover.getRoverDirection();
        assertTrue(xCoordinate==1 && yCoordinate==2 && roverDirection.equals("N"));
    }

    @Test
    public void shouldMoveRoverFromOneTwoNorthToOneThreeSouth() {
        Rover rover = new Rover("1 2 N");
        String movements = "LMLMLMLMM";
        String finalPosition = rover.getFinalPosition(movements);
        assertTrue(finalPosition.equals("1 3 N"));
    }

    @Test
    public void shouldMoveRoverFromThreeThreeEastToFiveOneEast() {
        Rover rover = new Rover("3 3 E");
        String movements = "MMRMMRMRRM";
        String finalPosition = rover.getFinalPosition(movements);
        assertTrue(finalPosition.equals("5 1 E"));
    }

}
