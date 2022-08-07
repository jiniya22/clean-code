package me.jiniworld.clean.funcswitch;

public interface EmployeeFactory {
    public Employee makeEmployee(EmployeeRecord record) throws InvalidEmployeeType;
}