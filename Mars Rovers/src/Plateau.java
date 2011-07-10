public class Plateau {
    private static int xCoordinate, yCoordinate;
    private  String [] coordinatesOfPlateau;

    public Plateau(String coordinatesOfPlateau) {
        this.coordinatesOfPlateau = coordinatesOfPlateau.split(" ");
        extractCoordinates();
    }

    public static int getYCoordinate() {
        return yCoordinate;
    }

    public static int getXCoordinate() {
        return xCoordinate;
    }

    private void extractCoordinates() {
        xCoordinate = Integer.parseInt(coordinatesOfPlateau[0]);
        yCoordinate = Integer.parseInt(coordinatesOfPlateau[1]);
    }


}
