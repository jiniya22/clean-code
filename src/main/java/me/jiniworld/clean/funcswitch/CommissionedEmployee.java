package me.jiniworld.clean.funcswitch;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CommissionedEmployee implements Employee {
    private EmployeeRecord employeeRecord;

    public CommissionedEmployee(EmployeeRecord employeeRecord) {
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