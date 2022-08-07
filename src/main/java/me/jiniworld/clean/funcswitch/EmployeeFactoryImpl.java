package me.jiniworld.clean.funcswitch;

public class EmployeeFactoryImpl implements EmployeeFactory {
    @Override
    public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType {
        return switch (r.type) {
            case COMMISSIONED -> new CommissionedEmployee(r);
            case HOURLY -> new HourlyEmployee(r);
            case SALARIED -> new SalariedEmployee(r);
            default -> throw new InvalidEmployeeType(r.type);
        };
    }
}
