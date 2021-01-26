package day7;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
        if (stamina > MIN_STAMINA) {
            stamina -= 1;
            if (stamina == MIN_STAMINA) {
                countPlayers--;
            }
        }
    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        } else if (countPlayers > 1 && countPlayers < 5) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных места");
        } else if (countPlayers == 1) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободное место");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }

}