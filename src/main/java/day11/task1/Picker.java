package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.setCountPickedOrders(warehouse.getCountPickedOrders() + 1);

    }

    @Override
    public void bonus() {
        if (this.isPayed == true) {
            System.out.println("Бонус уже был выплачен");
        }
        if (this.isPayed == false) {
            if (warehouse.getCountPickedOrders() < 10000) {
                System.out.println("Бонус пока не доступен");
            } else if (warehouse.getCountPickedOrders() == 10000) {
                salary += 70000;
                this.isPayed = true;
            }
        }

    }
}
