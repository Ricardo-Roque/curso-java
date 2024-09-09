package entities.emplyoee;

import entities.emplyoee.EmployeePolimorfism;

public class OutsourceEmployee extends EmployeePolimorfism {
    private double additionalCharge;

    public OutsourceEmployee(String name, int hours, double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment() {
        return super.payment() + additionalCharge * 1.1;
    }
}
