
/**
 * Tic-Tac-Toe
 *
 * @author Jan Adams
 * @version 14.08.2020
 */

public class Message {

    public void wrongInputVersion() {
        System.out.println("\n" + "wählen sie bitte zwischen VA(UTF-8) -> \"a\" und VB(ASII) -> \"b\"");
    }

    public void wrongInputChoseEnemy() {
        System.out.println("\n" + "wählen sie bitte zwischen Gary -> \"a\" und Peach -> \"b\"");
    }

    public void wrongInput() {
        System.out.println("\ngeben sie ein Wert zwischen a1 - c3 ein -> um das Spiel zu beenden geben Sie \"e\" ein");
    }

    public void gameRules() {
        System.out.println("\n" + "geben sie ein Wert zwischen a1 - c3 ein -> um das Spiel zu beenden geben Sie \"e\" ein\n");
    }

    public void fieldOccupied() {
        System.out.println("\nder eingebene Wert ist nicht zulässig");
    }

    public void userWins(String enemyName) {
        switch (enemyName) {
            case "Borg" -> System.out.println("\nBorg-Königen: \nEs gibt kein mich. Es gibt nur uns! Ein Bewusstsein");
            case "Picard" -> System.out.println("\n Picard: \n" +
                    "\n Die Wirtschaft der Zukunft funktioniert ein bisschen anders \n" +
                    " Sehen Sie, im 24. Jahrhundert gib es kein Geld... \n" +
                    " Der Erwerb von Reichtum\n" +
                    " ist nicht mehr die treibende Kraft in unserem Leben\n" +
                    " Wir arbeiten um\n" +
                    " uns selbst zu verbessern — und den Rest der Menschheit\"\n");
            case "Data" -> System.out.println("\nIch habe nicht genug Informationen für eine Theorie, Sir");
        }
    }

    public void enemyWins(String enemyName) {
        switch (enemyName) {
            case "Borg" -> System.out.println("\nBorg-Königen: \n" +
                    "Tapfere Worte, ich habe sie schon von Tausenden von Arten auf Tausenden Welten gehört\n " +
                    "lange bevor Sie geschaffen wurden; doch jetzt sind sie alle Borg\n" +
                    "Beobachte das Ende Eurer Zukunft");
            case "Picard" -> System.out.println("\nPicard: \"Berichte über meine Assimilierung sind stark übertrieben\"");
            case "Data" -> System.out.println("\nWir müssen immer danach streben mehr zu sein, als wir sind.");
        }
    }

    public void noWinner() {
        System.out.println("\n" + "UNENTSCHIEDEN!! probiere es nochmal aus ");
    }

    public void chooseVersion() {
        System.out.println("\n wählen sie eine Version \n");
        System.out.println(" -> Version A (das Terminal muss UTF-8 unterstützen): -> geben Sie \"a\" ein  \n");
        System.out.println(" -> Version B (standard Version) -> geben Sie \"b\" ein \n");
    }

    public void chooseEnemy() {
        System.out.println("\n wählen sie ihren Gegner \n");
        System.out.println(" -> Borg-Königen -> geben Sie \"a\" ein  \n");
        System.out.println(" -> Jean-Luc Picard -> geben Sie \"b\" ein \n");
        System.out.println(" -> Data -> geben Sie \"c\" ein \n");
    }

    public void enemyConfirm(String enemyName) {

        switch (enemyName) {
            case "Borg" -> System.out.println("\nBorg-Königen \n\n" +
                    "Wir sind die Borg\n" +
                    " Deaktivieren Sie Ihre Schutzschilde und ergeben Sie sich!\n" +
                    " Wir werden Ihre biologischen und technologischen Charakteristika den unsrigen hinzufügen\n" +
                    " Ihre Kultur wird sich anpassen und uns dienen\n" +
                    " Widerstand ist Zwecklos!\"\n");
            case "Picard" -> System.out.println("\nJean-Luc Picard  \n\n" +
                    "Mit dem ersten Glied ist die Kette geschmiedet\n" +
                    " Wenn die erste Rede zensiert, der erste Gedanke verboten, die erste Freiheit verweigert wird\n" +
                    " dann sind wir alle unwiderruflich gefesselt\n" +
                    "\n" +
                    "Die Vergangenheit ist geschrieben, aber die Zukunft ist noch nicht in Stein gemeißelt\n");
            case "Data" -> System.out.println("\nData \n\n" +
                    "Ich bin konstruiert, um menschliche Fähigkeiten zu übertreffen, sowohl mental als auch physisch");
        }
    }

    public void playAgain(){
        System.out.println("\nmöchte sie noch eine Runde spielen?\n" +
                "\n geben sie \"j\" -> um noch eine runde zu spielen" +
                "\n geben sie \"n\" -> um das Spiel zu verlassen");
    }

}
