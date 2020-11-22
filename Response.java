import java.util.Random;

/**
 * Tic-Tac-Toe
 *
 * @author Jan Adams
 * @version 17.08.2020
 */

public class Response {

    private final String userIcon;
    private final String fieldIcon;
    private final String enemyIcon;
    private String response;
    private final Game game;

    public Response(Game game) {
        this.game = game;
        this.userIcon = game.getUserIcon();
        this.fieldIcon = game.getFieldToken();
        this.enemyIcon = game.getEnemyIcon();
    }

    protected String responseEasyInput() { // x-achse


        if (game.getA2().equals(userIcon) && game.getA3().equals(userIcon) && game.getA1().equals(fieldIcon)) {
            response = "a1";
        }
        else if (game.getB2().equals(userIcon) && game.getB3().equals(userIcon) && game.getB1().equals(fieldIcon)) {
            response = "bi";
        }
        else if (game.getC2().equals(userIcon) && game.getC3().equals(userIcon) && game.getC1().equals(fieldIcon)) {
            response = "ci";
        }

        else if (game.getA1().equals(userIcon) && game.getA3().equals(userIcon) && game.getA2().equals(fieldIcon)) {
            response = "a2";
        }
        else if (game.getB1().equals(userIcon) && game.getB3().equals(userIcon) && game.getB2().equals(fieldIcon)) {
            response = "b2";
        }
        else if (game.getC1().equals(userIcon) && game.getC3().equals(userIcon) && game.getC2().equals(fieldIcon)) {
            response = "c2";
        }

        else if (game.getA1().equals(userIcon) && game.getA2().equals(userIcon) && game.getA3().equals(fieldIcon)) {
            response = "a3";
        }
        else if (game.getB1().equals(userIcon) && game.getB2().equals(userIcon) && game.getB3().equals(fieldIcon)) {
            response = "b3";
        }
        else if (game.getC1().equals(userIcon) && game.getC2().equals(userIcon) && game.getC3().equals(fieldIcon)) {
            response = "c3";
        }
        else {
            response = null;
        }

        return response;

    }

    protected String responseMediumInput() {  // y-achse

        if (game.getA1().equals(userIcon) && game.getB1().equals(userIcon) && game.getC1().equals(fieldIcon)) {
            response = "c1";
        }
        else if (game.getA2().equals(userIcon) && game.getB2().equals(userIcon) && game.getC2().equals(fieldIcon)) {
            response = "c2";
        }
        else if (game.getA3().equals(userIcon) && game.getB3().equals(userIcon) && game.getC3().equals(fieldIcon)) {
            response = "c3";
        }

        else if (game.getA1().equals(userIcon) && game.getC1().equals(userIcon) && game.getB1().equals(fieldIcon)) {
            response = "b1";
        }
        else if (game.getA2().equals(userIcon) && game.getC2().equals(userIcon) && game.getB2().equals(fieldIcon)) {
            response = "b2";
        }
        else if (game.getA3().equals(userIcon) && game.getC3().equals(userIcon) && game.getB3().equals(fieldIcon)) {
            response = "b3";
        }

        else if (game.getC1().equals(userIcon) && game.getB1().equals(userIcon) && game.getA1().equals(fieldIcon)) {
            response = "a1";
        }
        else if (game.getC2().equals(userIcon) && game.getB2().equals(userIcon) && game.getA2().equals(fieldIcon)) {
            response = "a2";
        }
        else if (game.getC3().equals(userIcon) && game.getB3().equals(userIcon) && game.getA3().equals(fieldIcon)) {
            response = "a3";
        }
        else {
            response = null;
        }

        return response;
    }

    protected String strategyResponse() {

        if (game.getA1().equals(enemyIcon) && game.getA2().equals(enemyIcon) && game.getA3().equals(fieldIcon)) {
            response = "a3";
        }
        else if (game.getB1().equals(enemyIcon) && game.getB2().equals(enemyIcon) && game.getB3().equals(fieldIcon)) {
            response = "b3";
        }
        else if (game.getC1().equals(enemyIcon) && game.getC2().equals(enemyIcon) && game.getC3().equals(fieldIcon)) {
            response = "c3";
        }
        else if (game.getA2().equals(enemyIcon) && game.getA3().equals(enemyIcon) && game.getA1().equals(fieldIcon)) {
            response = "a1";
        }
        else if (game.getB2().equals(enemyIcon) && game.getB3().equals(enemyIcon) && game.getB1().equals(fieldIcon)) {
            response = "b1";
        }
        else if (game.getC2().equals(enemyIcon) && game.getC3().equals(enemyIcon) && game.getC1().equals(fieldIcon)) {
            response = "c1";
        }
        else {
            response = null;
        }

        return response;

    }

    protected String randomStrategieResponse() {

        if (game.getA1().equals(enemyIcon) && game.getB1().equals(enemyIcon) && game.getC1().equals(fieldIcon)) {
            response = "c1";
        }
        else if (game.getA2().equals(enemyIcon) && game.getB2().equals(enemyIcon) && game.getC2().equals(fieldIcon)) {
            response = "c2";
        }
        else if (game.getA3().equals(enemyIcon) && game.getB3().equals(enemyIcon) && game.getC3().equals(fieldIcon)) {
            response = "c3";
        }
        else if (game.getC1().equals(enemyIcon) && game.getB1().equals(enemyIcon) && game.getA1().equals(fieldIcon)) {
            response = "a1";
        }
        else if (game.getC2().equals(enemyIcon) && game.getB2().equals(enemyIcon) && game.getA2().equals(fieldIcon)) {
            response = "a2";
        }
        else if (game.getC3().equals(enemyIcon) && game.getB3().equals(enemyIcon) && game.getA3().equals(fieldIcon)) {
            response = "a3";
        }
        else {
            response = null;
        }

        return  response;

    }

    protected String proResponse(){

        if((game.getA1().equals(userIcon) || game.getA3().equals(userIcon) ||
                game.getC1().equals(userIcon) ||  game.getC3().equals(userIcon))
                && game.getB2().equals(fieldIcon)){
            response = "b2";
        }
        else if(game.getA1().equals(enemyIcon) && game.getC3().equals(fieldIcon)){
            response = "c3";
        }
        else if(game.getA3().equals(enemyIcon) && game.getC1().equals(fieldIcon)){
            response = "c1";
        }
        else if(game.getC1().equals(enemyIcon) && game.getA3().equals(fieldIcon)){
            response = "a3";
        }
        else if(game.getC3().equals(enemyIcon) && game.getA1().equals(fieldIcon)){
            response = "a1";
        }
        else if(game.getA1().equals(enemyIcon) && game.getA3().equals(enemyIcon) && game.getC1().equals(fieldIcon)){
            response = "c1";
        }
        else if(game.getC1().equals(enemyIcon) && game.getA3().equals(enemyIcon) && game.getC3().equals(fieldIcon)){
            response = "c3";
        }
        else {
            response = null;
        }

        return response;
    }

    protected String randomResponse() {
        response = null;

        while (response == null) {

            Random rand = new Random();
            int gridNumber = rand.nextInt(8);

            Validate validateResponse = new Validate(game);

            if (validateResponse.checkIfFree(gridNumber)) {
                response = gridNumberToResponse(gridNumber);
            }
        }

        return response;
    }

    protected String gridNumberToResponse(int gridNumber) {

        switch (gridNumber) {
            case 0 -> response = "a1";
            case 1 -> response = "a2";
            case 2 -> response = "a3";
            case 3 -> response = "b1";
            case 4 -> response = "b2";
            case 5 -> response = "b3";
            case 6 -> response = "c1";
            case 7 -> response = "c2";
            case 8 -> response = "c3";

        }

        return response;
    }

}
