package day8;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        long start = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            builder.append(i + " ");
        }
        long end = System.currentTimeMillis();

        System.out.println("Time StringBuilder " + (end - start));
        System.out.println(builder.toString());

        String s = "";

        start = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            s += i + " ";
        }
        end = System.currentTimeMillis();
        System.out.println("Time String " + (end - start));
        System.out.println(s);

    }

}