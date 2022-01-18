package com.tangwei.csc2016.b2;

/**
 * @author TangWei on 2022/1/18
 */
public class Worker {
    protected String name;
    protected double salaryRate;

    public Worker() {
    }

    public Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalaryRate() {
        return salaryRate;
    }

    public void setSalaryRate(double salaryRate) {
        this.salaryRate = salaryRate;
    }

    public double computePay(int hours) {
        return hours * salaryRate;
    }
}
