package com.tangwei.csc2016.b2;

/**
 * @author TangWei on 2022/1/18
 */
public class Test {
    public static String weeklyReport(Worker worker, int hours) {
        String name = worker.getName();
        String type = "worker";
        if (worker instanceof HourlyWorker) {
            type = "hourly worker";
        }
        if (worker instanceof SalariedWorker) {
            type = "salaried worker";
        }
        double salary = worker.computePay(hours);

        return name + " is a " + type + " , he/she's salary is " + salary;
    }

    public static void main(String[] args) {
        Worker worker1 = new HourlyWorker("Tom", 6);
        Worker worker2 = new HourlyWorker("Kate", 5);

        Worker worker3 = new SalariedWorker("Wang", 9);
        Worker worker4 = new SalariedWorker("Lil Ghost", 7);

        System.out.println(weeklyReport(worker1, 30));
        System.out.println(weeklyReport(worker2, 45));

        System.out.println(weeklyReport(worker3, 43));
        System.out.println(weeklyReport(worker4, 29));
    }
}
