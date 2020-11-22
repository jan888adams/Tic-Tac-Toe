/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

/**
 * Tic-Tac-Toe
 *
 * @author Jan Adams
 * @version 18.08.2020
 */

public class EnemyData extends Enemy implements EnemyInterface {
    private final Game currentGame;
    private String response = null;

    public EnemyData(Game game) {
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
            case 0 -> response = enemy.strategyResponse();
            case 1 -> response = enemy.randomStrategieResponse();
            case 2 -> response = enemy.responseEasyInput();
            case 3 -> response = enemy.responseMediumInput();
            case 4 -> response = enemy.proResponse();
            case 5 -> response = enemy.randomResponse();

        }
        return response;
    }


}
