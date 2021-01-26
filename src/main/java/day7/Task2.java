package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int x = rnd.nextInt((10) + 90);
        Player player1 = new Player(x);
        Player player2 = new Player(x);
        Player player3 = new Player(x);
        Player player4 = new Player(x);
        Player player5 = new Player(x);
        Player player6 = new Player(x);
        Player player7 = new Player(x); //проверка на 7-го игрока

        System.out.println(Player.getCountPlayers()); //число игроков на поле не меняется

        Player.info();

        for (int i = player1.getStamina(); player1.getStamina() > 0; i--) {
            player1.run();
        }
        System.out.println(Player.getCountPlayers());

    }
}