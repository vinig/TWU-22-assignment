public class Rover {
    private String[] initialPosition;
    private int xCoordinate;
    private int yCoordinate;
    private String roverDirection;

    public Rover(String initialPosition) {
        this.initialPosition = initialPosition.split(" ");
        initializeRover();
    }

    private void initializeRover() {
        xCoordinate = Integer.parseInt(initialPosition[0]);
        yCoordinate = Integer.parseInt(initialPosition[1]);
        roverDirection = initialPosition[2];
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public String getDirection() {
        return roverDirection;
    }
}
