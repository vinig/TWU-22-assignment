import cuke4duke.annotation.I18n.EN.*;

import static org.junit.Assert.assertTrue;


public class MarsRoverSteps {

     Plateau plateau;
     Rover rover;
     String finalPositionOfRover;

    @Given("^I enter the end coordinates of Plateau as ([^\"]*)$")
    public void definingEndCoordinatesOfPlateau(String endCoordinates) {
        plateau = new Plateau(endCoordinates);
    }

    @When("^I enter the initial position of the Rover as ([^\"]*)$")
    public void initializingThePositionOfRover(String initialPosition){
        rover = new Rover(initialPosition);
    }

    @When("^I give the instructions for its movement as ([^\"]*)$")
    public void instructionsForMovement(String movement){
        finalPositionOfRover = rover.getFinalPosition(movement);
    }

    @Then("^the Mars Rover should reach position ([^\"]*)$")
    public void finalPositionReached(String finalPosition){
        assertTrue(finalPosition.equals(finalPositionOfRover));
    }

}
