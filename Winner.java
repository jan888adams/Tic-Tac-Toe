/**
 * Tic-Tac-Toe
 *
 * @author Jan Adams
 * @version 12.08.2020
 */

public class Winner {

    private final Game game;
    private final String fieldIcon;
    private boolean response = false;

    public Winner(Game currentGame) {

        this.game = currentGame.getCurrentGame();
        this.fieldIcon = game.getFieldToken();
    }

    public boolean checkWinner(String icon) {

        if (game.getA1().equals(icon) && game.getA2().equals(icon) && game.getA3().equals(icon)) {
            response = true;
        }
        else if (game.getB1().equals(icon) && game.getB2().equals(icon) && game.getB3().equals(icon)) {
            response = true;
        }
        else if (game.getC1().equals(icon) && game.getC2().equals(icon) && game.getC3().equals(icon)) {
            response = true;

        }
        else if (game.getA1().equals(icon) && game.getB1().equals(icon) && game.getC1().equals(icon)) {
            response = true;
        }
        else if (game.getA2().equals(icon) && game.getB2().equals(icon) && game.getC2().equals(icon)) {
            response = true;
        }
        else if (game.getA3().equals(icon) && game.getB3().equals(icon) && game.getC3().equals(icon)) {
            response = true;
        }

        return response;
    }


    public boolean checkFieldState() {

        String[] fieldState = game.getFieldState();
        int counter = 0;

        for (String spot : fieldState) {
            if (spot.equals(fieldIcon)) {
                counter++;
            }
        }

        return counter == 1;

    }

}
