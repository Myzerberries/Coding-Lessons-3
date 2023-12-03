public class Main {
    public static void main(String[] args){

        int newScore = calculateScore("Tim", 500);
        System.out.println(newScore);

        calculateScore(75);

        calculateScore();

    }

    // Method Overloading is using the same method twice, but changing the type, number, or order of parameters.
    //The main purpose of method overloading is to keep code cleaner.

    public static int calculateScore(String playerName, int score){

        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(int score){

        System.out.println("Unnamed player" + " scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(){

        System.out.println("No player name, no player score.");
        return 0;
    }
}
