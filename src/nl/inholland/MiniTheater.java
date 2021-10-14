package nl.inholland;

public class MiniTheater {
    public static final int NUMBER_ROWS = 3;
    public static final int NUMBER_COLS = 2;
    String[][] twoDArray = new String[NUMBER_ROWS][NUMBER_COLS];

    public void initSeats() {
        for (int row = 0; row < NUMBER_ROWS; row++) {
            for (int col = 0; col < NUMBER_COLS; col++) {
                if (row == 0 || col == 0) {
                    twoDArray[row][col] = "Reserved";
                } else {
                    twoDArray[row][col] = "Free";
                }
            }
        }

        for (int row = 0; row < twoDArray.length; row++) {
            for (int col = 0; col < twoDArray[row].length; col++) {
                System.out.print(twoDArray[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
