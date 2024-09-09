package entities.composition;

import java.util.Calendar;
import java.util.Date;

public class HourContract {
    private Date date;
    private double valuePerHour;
    private int duration;

    public HourContract(Date date, double valuePerHour, int duration) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.duration = duration;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double totalValue(){
        return valuePerHour * duration;
    }

}
