import java.util.Scanner;

/**
 * Tic-Tac-Toe
 *
 * @author Jan Adams
 * @version 12.08.2020
 */

public class User {

    private final Game game;
    private final String userIcon;
    private boolean validResponse = false;

    public User(Game currentGame) {

        this.game = currentGame.getCurrentGame();
        this.userIcon = game.getUserIcon();
    }

    public void setUserInput(){

        Validate validateInput = new Validate(game);
        Message message = new Message();

        while(!validResponse) {

            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();

        switch (input) {
            case "a1" -> {
                if(validateInput.checkIfFree(0)){
                    game.setA1(userIcon);
                    setValidResponse(true);
                }
            }
            case "a2" -> {
                if(validateInput.checkIfFree(1)){
                    game.setA2(userIcon);
                    setValidResponse(true);
                }
            }
            case "a3" -> {
                if(validateInput.checkIfFree(2)){
                    game.setA3(userIcon);
                    setValidResponse(true);
                }
            }
            case "b1" -> {
                if(validateInput.checkIfFree(3)){
                    game.setB1(userIcon);
                    setValidResponse(true);
                }
            }
            case "b2" -> {
                if(validateInput.checkIfFree(4)){
                    game.setB2(userIcon);
                    setValidResponse(true);
                }
            }
            case "b3" -> {
                if(validateInput.checkIfFree(5)){
                    game.setB3(userIcon);
                    setValidResponse(true);
                }
            }
            case "c1" -> {
                if(validateInput.checkIfFree(6)){
                    game.setC1(userIcon);
                    setValidResponse(true);
                }
            }
            case "c2" -> {
                if(validateInput.checkIfFree(7)){
                    game.setC2(userIcon);
                    setValidResponse(true);
                }
            }
            case "c3" -> {
                if(validateInput.checkIfFree(8)){
                    game.setC3(userIcon);
                    setValidResponse(true);
                }
            }
            case "e" -> {
                game.setExit(true);
                setValidResponse(true);

            }
            default -> message.wrongInput();
        }

            if (!validResponse) {
                message.fieldOccupied();
            }

        }
    }

    public String chooseEnemy() {
        String response = null;

        while (!validResponse) {

            Scanner scann = new Scanner(System.in);
            String reply = scann.next();

            switch (reply) {
                case "a" -> {
                    response = "Borg";
                    setValidResponse(true);
                }
                case "b" -> {
                    response = "Picard";
                    setValidResponse(true);
                }
                case "c" -> {
                    response = "Data";
                    setValidResponse(true);
                }
                default -> {
                    Message message = new Message();
                    message.chooseEnemy();
                }
            }
        }

        return response;
    }

    public void setValidResponse(boolean validResponse) {
        this.validResponse = validResponse;
    }
}
