
import java.util.Scanner;

/**
 * Tic-Tac-Toe
 *
 * @author Jan Adams
 * @version 12.08.2020
 */

public class Validate {

    private final String[] currentFieldState;
    private final String fieldIcon;
    private boolean validResponse = false;

    public Validate(Game currentGame) {
        this.currentFieldState = currentGame.getFieldState();
        this.fieldIcon = currentGame.getFieldToken();

    }

    public boolean checkIfFree(int gridNumber) {
        return currentFieldState[gridNumber].equals(fieldIcon);

    }

    public boolean checkIfNewGame() {

        boolean response = false;

        while (!validResponse) {

            Scanner scann = new Scanner(System.in);
            String reply = scann.next();

            switch (reply) {
                case "j" -> {
                    response = true;
                    setValidResponse();
                }
                case "n" -> {
                    setValidResponse();
                }
                default -> {
                    Message message = new Message();
                    message.playAgain();
                }
            }
        }

        return response;
    }

    private void setValidResponse() {
        this.validResponse = true;

    }

}
