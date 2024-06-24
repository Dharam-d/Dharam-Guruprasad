package com.wipro;

public class Date {
    private int intDay, intMonth, intYear;

    // Constructor
    public Date(int intDay, int intMonth, int intYear) {
        this.intDay = intDay;
        this.intMonth = intMonth;
        this.intYear = intYear;
    }

    // Setter and Getter methods for day, month, and year
    public void setDay(int intDay) {
        this.intDay = intDay;
    }

    public int getDay() {
        return this.intDay;
    }

    public void setMonth(int intMonth) {
        this.intMonth = intMonth;
    }

    public int getMonth() {
        return this.intMonth;
    }

    public void setYear(int intYear) {
        this.intYear = intYear;
    }

    public int getYear() {
        return this.intYear;
    }

    // toString method to convert Date object to string
    public String toString() {
        return "Date is " + intDay + "/" + intMonth + "/" + intYear;
    }
}
