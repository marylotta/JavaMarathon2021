package day7;

import java.util.Random;

/*
2. Дворовый футбол.
Для игры в футбол во дворе требуется 6 человек (3х3). Класс Игрок (англ. Player) содержит следующие поля:
Поле “выносливость” (англ. stamina), разное для каждого экземпляра, инициализируется через конструктор.
Константы “максимальная выносливость” (англ. MAX_STAMINA) со значением 100 и “минимальная выносливость” (англ. MIN_STAMINA) со значением 0, единые для всех экземпляров.
Статическое поле countPlayers, которое считает количество игроков на футбольном поле (изначально их 0, выходом на поле считается создание экземпляра класса, уходом - когда игрок устал).
Геттеры для полей “выносливость” и “количество игроков”.

Задание: Создать класс Player по вышеописанному шаблону. В методе main() создать объект класса Random, который будет
генерировать случайные числа. Создать 6 игроков, передавая им в качестве аргумента в конструктор случайно сгенерированные числа от 90 до 100.
 Вызвать метод info(). При попытке создать 7,8 … n игрока, количество игроков на поле меняться не должно, проверить это.
 */
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