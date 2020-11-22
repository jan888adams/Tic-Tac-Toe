
/**
 * Tic-Tac-Toe
 *
 * @author Jan Adams
 * @version 11.08.2020
 */

public class Game {

    private String a1;
    private String a2;
    private String a3;
    private String b1;
    private String b2;
    private String b3;
    private String c1;
    private String c2;
    private String c3;

    private Game currentGame;
    private boolean exit = false;

    private final String fieldToken;
    private final String userIcon;
    private final String enemyIcon;

    public Game(String fieldToken, String userIcon, String enemyIcon) {

        this.fieldToken = fieldToken;
        this.userIcon = userIcon;
        this.enemyIcon = enemyIcon;
        this.a1 = fieldToken;
        this.a2 = fieldToken;
        this.a3 = fieldToken;
        this.b1 = fieldToken;
        this.b2 = fieldToken;
        this.b3 = fieldToken;
        this.c1 = fieldToken;
        this.c2 = fieldToken;
        this.c3 = fieldToken;

    }

    public void generateNewEnemy(Game currentGame) {
        this.currentGame = currentGame;
    }

    public void startGame() {

        Message message = new Message();
        message.chooseEnemy();
        User chooseEnemy = new User(currentGame);
        String selectedEnemy = chooseEnemy.chooseEnemy();
        message.enemyConfirm(selectedEnemy);

        PrintField.printExampleField();
        message.gameRules();

        while (!exit) {

            Winner fieldState = new Winner(currentGame);
            Validate playAgain = new Validate(currentGame);

            if (fieldState.checkFieldState()) {
                PrintField printField = new PrintField(currentGame);
                printField.printCurrentField();
                message.noWinner();
                message.playAgain();
                if (playAgain.checkIfNewGame()) {
                    startNewGame();
                }
                else {
                    setExit(true);
                }
            }
            else {
                User userResponse = new User(currentGame);
                userResponse.setUserInput();
                Winner user = new Winner(currentGame);
                if (user.checkWinner(userIcon)) {
                    PrintField printField = new PrintField(currentGame);
                    printField.printCurrentField();
                    message.userWins(selectedEnemy);
                    message.playAgain();
                    if (playAgain.checkIfNewGame()) {
                        startNewGame();
                    }
                    else {
                        setExit(true);
                    }
                }
                else {
                    if (selectedEnemy.equals("Picard")) {
                        EnemyPicard enemyResponses = new EnemyPicard(currentGame);
                        enemyResponses.enemyResponse();
                    }
                    else if (selectedEnemy.equals("Borg")) {
                        EnemyBorg enemyResponses = new EnemyBorg(currentGame);
                        enemyResponses.enemyResponse();
                    }
                    else {
                        EnemyData enemyResponses = new EnemyData(currentGame);
                        enemyResponses.enemyResponse();
                    }
                    Winner enemy = new Winner(currentGame);
                    if (enemy.checkWinner(enemyIcon)) {
                        PrintField printField = new PrintField(currentGame);
                        printField.printCurrentField();
                        message.enemyWins(selectedEnemy);
                        message.playAgain();
                        if (playAgain.checkIfNewGame()) {
                            startNewGame();
                        }
                        else {
                           setExit(true);
                        }
                    }
                    else if (!exit) {
                        PrintField printField = new PrintField(currentGame);
                        printField.printCurrentField();
                    }
                }

            }
        }

    }

    private void startNewGame() {
        Boot ticTacToe = new Boot();
        ticTacToe.bootGame();
    }

    public String[] getFieldState() {
        String[] field = new String[9];

        field[0] = getA1();
        field[1] = getA2();
        field[2] = getA3();
        field[3] = getB1();
        field[4] = getB2();
        field[5] = getB3();
        field[6] = getC1();
        field[7] = getC2();
        field[8] = getC3();

        return field;
    }

    public String getA1() {
        return a1;
    }

    public String getA2() {
        return a2;
    }

    public String getA3() {
        return a3;
    }

    public String getB1() {
        return b1;
    }

    public String getB2() {
        return b2;
    }

    public String getB3() {
        return b3;
    }

    public String getC1() {
        return c1;
    }

    public String getC2() {
        return c2;
    }

    public String getC3() {
        return c3;
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

    public Game getCurrentGame() {
        return currentGame;
    }

    public void setA1(String a1) {
        this.a1 = a1;
    }

    public void setA2(String a2) {
        this.a2 = a2;
    }

    public void setA3(String a3) {
        this.a3 = a3;
    }

    public void setB1(String b1) {
        this.b1 = b1;
    }

    public void setB2(String b2) {
        this.b2 = b2;
    }

    public void setB3(String b3) {
        this.b3 = b3;
    }

    public void setC1(String c1) {
        this.c1 = c1;
    }

    public void setC2(String c2) {
        this.c2 = c2;
    }

    public void setC3(String c3) {
        this.c3 = c3;
    }

    public void setExit(boolean exit) {
        this.exit = exit;
    }

}
