/**
 * Tic-Tac-Toe
 *
 * @author Jan Adams
 * @version 15.08.2020
 */

public class Boot {

    public void bootGame() {

        Message message = new Message();
        message.chooseVersion();
        Version version = new Version();
        String input = version.chooseVersion();

        String userIcon;
        String enemyIcon;
        String fieldIcon;

        if (input.equals("a")) {
            fieldIcon = version.getColorFieldToken();
            userIcon = version.getColorUserIcon();
            enemyIcon = version.getColorEnemyIcon();
        }
        else {
            fieldIcon = version.getFieldToken();
            userIcon = version.getUserIcon();
            enemyIcon = version.getEnemyIcon();
        }

        Game ticTacToe = new Game(fieldIcon, userIcon, enemyIcon);
        ticTacToe.generateNewEnemy(ticTacToe);
        ticTacToe.startGame();
    }
}
