import java.util.Scanner;

/**
 * Tic-Tac-Toe
 *
 * @author Jan Adams
 * @version 15.08.2020
 */

public class Version {

    private final String fieldToken;
    private final String userIcon;
    private final String enemyIcon;

    private final String colorFieldToken;
    private final String colorUserIcon;
    private final String colorEnemyIcon;

    private boolean validResponse;

    private String response;


    public Version() {

        this.fieldToken = "#";
        this.userIcon = "O";
        this.enemyIcon = "X";
        this.colorFieldToken = "\u2715";
        this.colorUserIcon = Colors.CYAN + "\u2715" + Colors.RESET;
        this.colorEnemyIcon = Colors.RED + "\u2715" + Colors.RESET;
        this.validResponse = false;

    }

    public String chooseVersion() {

        while (!validResponse) {

            Scanner scann = new Scanner(System.in);
            String answer = scann.next();

            switch (answer) {
                case "a" -> {
                    response = "a";
                    setValidResponse(true);
                }
                case "b" -> {
                    response = "b";
                    setValidResponse(true);
                }
                default -> {
                    Message message = new Message();
                    message.playAgain();
                }
            }

        }

        return response;
    }



    public void setValidResponse(boolean validResponse) {
        this.validResponse = validResponse;
    }

    public String getFieldToken() {
        return fieldToken;
    }

    public String getUserIcon() {
        return userIcon;
    }

    public String getEnemyIcon() {
        return enemyIcon;
    }

    public String getColorFieldToken() {
        return colorFieldToken;
    }

    public String getColorUserIcon() {
        return colorUserIcon;
    }

    public String getColorEnemyIcon() {
        return colorEnemyIcon;
    }
}
