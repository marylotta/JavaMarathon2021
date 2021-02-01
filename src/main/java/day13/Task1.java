package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Aleks");
        User user2 = new User("Malina");
        User user3 = new User("Stella");

        user1.sendMessage(user2, "Hello!");
        user1.sendMessage(user2, "How are you?");

        user2.sendMessage(user1, "Hi there!");
        user2.sendMessage(user1, "I'm fine!");
        user2.sendMessage(user1, "And you?");

        user3.sendMessage(user1, "Did you pass your exam?");
        user3.sendMessage(user1, "Was it hard?");
        user3.sendMessage(user1, "How long did it take?");

        user1.sendMessage(user3, "I've passed!");
        user1.sendMessage(user3, "It was easy.");
        user1.sendMessage(user3, "It took me 45 minutes.");

        user3.sendMessage(user1, "Good for you!");

        MessageDatabase.showDialog(user1,user3);
    }
}
