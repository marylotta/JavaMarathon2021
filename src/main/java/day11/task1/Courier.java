package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public void setPayed(boolean payed) {
        isPayed = payed;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    public Courier(int salary, boolean isPayed) {
        this.salary = salary;
        this.isPayed = isPayed;
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.setCountDeliveredOrders(warehouse.getCountDeliveredOrders() + 1);

    }

    @Override
    public void bonus() {
        if (this.isPayed == true){
            System.out.println("Бонус уже был выплачен");

        }
        if (this.isPayed == false) {
            if (warehouse.getCountDeliveredOrders() < 10000) {
                System.out.println("Бонус пока не доступен");
            } else if (warehouse.getCountDeliveredOrders() == 10000) {
                salary += 50000;
                this.isPayed = true;
            }
        }

    }
}
