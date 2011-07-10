import org.junit.Test;

import static junit.framework.Assert.assertTrue;

public class MarsRoverTest {

    Plateau plateau;

    public MarsRoverTest() {
        plateau = new Plateau("5 5");
    }

    @Test
    public void shouldReturnCoordinatesOfPlateauAsFiveAndFive(){
        int xCoordinate = plateau.getXCoordinate();
        int yCoordinate = plateau.getYCoordinate();
        assertTrue(xCoordinate == 5);
        assertTrue(yCoordinate==5);
    }

}
