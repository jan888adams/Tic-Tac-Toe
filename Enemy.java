

/**
 * Tic-Tac-Toe
 *
 * @author Jan Adams
 * @version 11.08.2020
 */

public class Enemy {

    private final Game game;
    private final String enemyIcon;
    private String response;
    private int gridNumber;


    public Enemy(Game game) {
        this.game = game;
        this.enemyIcon = game.getEnemyIcon();

    }

    public void enemyResponse() {
        int gridNumber;
        int nextResponse = 0;

        while (response == null) {
            response = generateResponses(nextResponse);

            if (response != null) {
                Validate validate = new Validate(game);
                gridNumber = responseToGridNumber(response);

                if (validate.checkIfFree(gridNumber)) {
                    setEnemyResponse(response);
                }
                else {
                    response = null;
                }
            }
            else {
                nextResponse++;
            }

        }
    }

    public String generateResponses(int number) {

        Response enemy = new Response(game);

        switch (number) {
            case 0 -> response = enemy.strategyResponse();
            case 1 -> response = enemy.randomStrategieResponse();
            case 2 -> response = enemy.responseEasyInput();
            case 3 -> response = enemy.responseMediumInput();
            case 4 -> response = enemy.randomResponse();
        }
        return response;
    }

    protected void setEnemyResponse(String enemyResponse) {

        switch (enemyResponse) {
            case "a1" -> game.setA1(enemyIcon);
            case "a2" -> game.setA2(enemyIcon);
            case "a3" -> game.setA3(enemyIcon);
            case "b1" -> game.setB1(enemyIcon);
            case "b2" -> game.setB2(enemyIcon);
            case "b3" -> game.setB3(enemyIcon);
            case "c1" -> game.setC1(enemyIcon);
            case "c2" -> game.setC2(enemyIcon);
            case "c3" -> game.setC3(enemyIcon);
        }
    }

    protected int responseToGridNumber(String response) {

        switch (response) {
            case "a1" -> gridNumber = 0;
            case "a2" -> gridNumber = 1;
            case "a3" -> gridNumber = 2;
            case "b1" -> gridNumber = 3;
            case "b2" -> gridNumber = 4;
            case "b3" -> gridNumber = 5;
            case "c1" -> gridNumber = 6;
            case "c2" -> gridNumber = 7;
            case "c3" -> gridNumber = 8;
        }

        return gridNumber;

    }


}
