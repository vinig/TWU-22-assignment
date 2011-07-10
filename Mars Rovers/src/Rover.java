
import java.util.HashMap;

public class Rover {
    private String[] initialPosition;
    private int xCoordinate;
    private int yCoordinate;
    private String roverDirection;
    private static final HashMap<String, Integer> DIRECTION_MAP;
    private static final HashMap<Integer, String > DIRECTION_MAP_REVERSE;

    static {
        DIRECTION_MAP = new HashMap<String, Integer>();
        DIRECTION_MAP_REVERSE = new HashMap<Integer, String>();

        DIRECTION_MAP.put("N",1);
        DIRECTION_MAP.put("E",2);
        DIRECTION_MAP.put("S",3);
        DIRECTION_MAP.put("W",4);

        DIRECTION_MAP_REVERSE.put(1,"N");
        DIRECTION_MAP_REVERSE.put(2,"E");
        DIRECTION_MAP_REVERSE.put(3,"S");
        DIRECTION_MAP_REVERSE.put(4,"W");
    }

    public Rover(String initialPosition) {
        this.initialPosition = initialPosition.split(" ");
        initializeRover();
    }

    private void initializeRover() {
        setXCoordinate(Integer.parseInt(initialPosition[0]));
        setYCoordinate(Integer.parseInt(initialPosition[1]));
        setRoverDirection(initialPosition[2]);
    }

    private void setRoverDirection(String roverDirection) {
        this.roverDirection = roverDirection.toUpperCase();
    }

    private void setYCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    private void setXCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public String getRoverDirection() {
        return roverDirection;
    }

    public String getFinalPosition(String movements) {
        movements = movements.toUpperCase();
        for (int index = 0; index < movements.length() ; index++){
            String instruction = movements.substring(index, index+1);
            takeAction(instruction);
        }
        return (getXCoordinate() + " " + getYCoordinate() + " " + getRoverDirection());
    }

    private void takeAction(String instruction) {
        if (instruction.equals("L") || instruction.equals("R")){
            changeDirection(instruction);
        } else {
            jumpStep();
        }

    }

    private void jumpStep() {
        int direction = DIRECTION_MAP.get(getRoverDirection());
        if (direction==1)
            setYCoordinate(getYCoordinate()+1);
        else if (direction==2)
            setXCoordinate(getXCoordinate()+1);
        else if (direction==3)
            setYCoordinate(getYCoordinate()-1);
        else
            setXCoordinate(getXCoordinate()-1);

        if ((getXCoordinate() > Plateau.getXCoordinate()) || (getXCoordinate() < 0) || (getYCoordinate() > Plateau.getYCoordinate()) || (getYCoordinate() < 0)){
            System.out.println("Rover is out of plateau");
            System.exit(1);
        }
    }

    private void changeDirection(String instruction) {
        int direction = DIRECTION_MAP.get(getRoverDirection());
        if (instruction.equals("L"))
            direction--;
        else
            direction++;

        if (direction==0)
            direction = 4;
        if (direction==5)
            direction = 1;
        setRoverDirection(DIRECTION_MAP_REVERSE.get(direction));
    }
}
