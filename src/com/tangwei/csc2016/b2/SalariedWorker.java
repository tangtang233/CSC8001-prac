package com.tangwei.csc2016.b2;

/**
 * @author TangWei on 2022/1/18
 */
public class SalariedWorker extends Worker {
    public SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    public double computePay(int hours) {
        return this.salaryRate * 40;
    }
}
