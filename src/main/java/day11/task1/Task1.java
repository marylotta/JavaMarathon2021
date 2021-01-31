package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

       businessProcess(picker);
       //businessProcess(picker);
       //businessProcess(courier);
       businessProcess(courier);

        System.out.println(picker);
        System.out.println(courier);

        Warehouse warehouse2 = new Warehouse();
        Picker picker2 = new Picker(warehouse2);
        Courier courier2 = new Courier(warehouse2);

        businessProcess(picker2);
        businessProcess(courier2);

        System.out.println(picker2);
        System.out.println(courier2);

    }

    public static void businessProcess(Worker worker){
        for (int i = 0; i <10000 ; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
