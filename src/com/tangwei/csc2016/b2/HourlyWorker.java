package com.tangwei.csc2016.b2;

/**
 * @author TangWei on 2022/1/18
 */
public class HourlyWorker extends Worker {
    public HourlyWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    public double computePay(int hours) {
        if (hours <= 40) {
            return this.salaryRate * hours;
        } else {
            return this.salaryRate * 40 + this.salaryRate * (hours - 40) * 2;
        }
    }
}
