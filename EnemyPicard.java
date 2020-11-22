/**
 * Tic-Tac-Toe
 *
 * @author Jan Adams
 * @version 17.08.2020
 */

public class EnemyPicard extends Enemy implements EnemyInterface{

    private final Game currentGame;
    private String response = null;

    public EnemyPicard(Game game) {
        super(game);
        this.currentGame = game;
    }

    @Override
    public void enemyResponse() {
        super.enemyResponse();
    }

    @Override
    public String generateResponses(int number) {
        Response enemy = new Response(currentGame);

        switch (number) {
            case 0, 3 -> response = null;
            case 1 -> response = enemy.randomStrategieResponse();
            case 2 -> response = enemy.responseEasyInput();
            case 4 -> response = enemy.randomResponse();

        }
        return response;
    }
}
