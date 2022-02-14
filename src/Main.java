import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

/// EX2: CREAR CLASSE JUGADOR (PLAYER) ON TINDREM DOS PROPIETATS: - NUMERO DE PARTIDES JUGADES - NUMERO DE PARTIGES GUANYADES
// ES PREGUNTA SI VOL TORNAR A TIRAR: SI DIU QUE SI, ES TIRA I S'ACTUALITZA EL CONTADOR
    // AL FINAL DE LA TIRADA, SEMPRE ES MOSTRA LES ESTADÍSTIQUES ACTUALS

    public static void main(String[] args) {
        //Player player = new Player();
        List<Player> players = new ArrayList<Player>();
        players = askNumberPlayers(players);

        do
        {
            for (Player player:players) {
                showDicesValue(player.getDice1(), player.getDice2());
                boolean result = hasWon(player.getDice1(), player.getDice2());
                if (hasWon(player.getDice1(), player.getDice2())) {
                    printHasWon();
                    player.resultRounds(result);

                } else {
                    printHasLost();
                    player.resultRounds(result);
                }
            }

        }
        while ((wantThrowDice()));
        for (Player player:players) {
            showResultsOfAllPlayedRounds(player);
        }


    }

    private static List<Player> askNumberPlayers(List<Player> players) {

        System.out.println("How many players want?");
        int numPlayers = new Scanner(System.in).nextInt();
        int cont = 0;
        while (cont < numPlayers)
            players.add(createPlayer());

        return players;
    }

    private static Player createPlayer() {
        Player player = new Player();

        giveDicesToPlayer(player);

        return  new Player();
    }

    private static void giveDicesToPlayer(Player player) {
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        player.throwDice1(dice1);
        player.throwDice2(dice2);
    }

    private static void showResultsOfAllPlayedRounds(Player player) {
        System.out.println(player);
    }

    private static boolean wantThrowDice() {
        System.out.println("Do you want to throw the dice and begin the game?");
        if(askQuestion()){
            return true;
        }
        return false;
    }

    private static boolean askQuestion() {
       return new Scanner(System.in).nextLine().equalsIgnoreCase("Y");
    }


    private static void printHasWon() {
        System.out.println("Has guanyat la partida! :D");
    }

    private static void printHasLost() {
        System.out.println("Has perdut la partida :'(");
    }

    private static void showDicesValue(Dice dice1, Dice dice2) {
        System.out.println("El resultat del dau 1 és: " + dice1.getValue());
        System.out.println("El resultat del dau 2 és: " + dice2.getValue());

        System.out.println("El resultat total de la tirada dels daus és: " + (dice1.getValue() + dice2.getValue()));
    }

    private static boolean hasWon(Dice dice1, Dice dice2) {
        int result = dice1.getValue() + dice2.getValue();
        return result == 7;
    }
}
