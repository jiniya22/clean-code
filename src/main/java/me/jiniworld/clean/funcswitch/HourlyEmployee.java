package me.jiniworld.clean.funcswitch;

public class HourlyEmployee implements Employee {
    private EmployeeRecord employeeRecord;

    public HourlyEmployee(EmployeeRecord employeeRecord) {
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