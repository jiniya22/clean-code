package me.jiniworld.clean.funcswitch;

public class SalariedEmployee implements Employee {
    private EmployeeRecord employeeRecord;

    public SalariedEmployee(EmployeeRecord employeeRecord) {
        this.employeeRecord = employeeRecord;
    }

    @Override
    public boolean isPayday() {
        return false;
    }

    @Override
    public Money calculatePay() {
        return null;
    }

    @Override
    public void deliverPay(Money money) {

    }
}