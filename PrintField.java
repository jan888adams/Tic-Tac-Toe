/**
 * Tic-Tac-Toe
 *
 * @author Jan Adams
 * @version 11.08.2020
 */

public class PrintField {
    private final Game game;


    public PrintField(Game currentGame) {
        this.game = currentGame;
    }

    public void printCurrentField(){
        printLineA();
        printLineB();
        printLineC();
    }

    private void printLineA() {
        System.out.println("\n" + "  " + "  " + game.getA1() + "  " + "  " + game.getA2() + "  " + "  " + game.getA3());
    }

    private void printLineB() {
        System.out.println("\n" + "  " + "  " + game.getB1() + "  " + "  " + game.getB2() + "  " + "  " + game.getB3());
    }

    private void printLineC() {
        System.out.println("\n" + "  " + "  " + game.getC1() + "  " + "  " + game.getC2() + "  " + "  " + game.getC3());
    }

    public static void printExampleField() {
        System.out.println("\n" + "  " + "  " + "a1" +
                "  " + "  " + "a2" + "  " + "  " + "a3" + "\n" + "  " + "  " + "b1" + "  " + "  " + "b2" +
                "  " + "  " + "b3" + "\n" + "  " + "  " + "c1" + "  " + "  " + "c2" + "  " + "  " + "c3" + "\n");
    }
}
