
import java.lang.reflect.Array;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Djon Bon Junzi
 */
public class Month {

    private String[] month = {"January", "February", "March", "April", "May", "June", "July", "Augest", "September", "October", "November", "December"};
    private int monthNumber;

    public Month() {
        this.monthNumber = 1;
    }

    public Month(int monthNumber) {
        if (monthNumber > 12 || monthNumber < 1) {
            this.monthNumber = 1;
        } else {
            this.monthNumber = monthNumber;
        }
    }

    public boolean equals(Month differentMonth) {
        if (this.monthNumber == differentMonth.monthNumber) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean greaterThan(Month differentMonth)
    {
        if(this.monthNumber > differentMonth.monthNumber)
        {
            return true;
        }else{
            return false;
        }
    }
    
    public boolean LessThan(Month differentMonth)
    {
        if(this.monthNumber < differentMonth.monthNumber)
        {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return this.getMonthName();
    }

    public String getMonthName() {
        String monthName = (String) Array.get(month, this.monthNumber - 1);
        return monthName;
    }

    public void setMonthNumber(int monthNumber) {
        if (monthNumber > 12 || monthNumber < 1) {
            this.monthNumber = 1;
        } else {
            this.monthNumber = monthNumber;
        }
    }

    public Month(String monthName) {

        switch (monthName) {
            case "January":
                this.monthNumber = 1;
                break;
            case "February":
                this.monthNumber = 2;
                break;
            case "March":
                this.monthNumber = 3;
                break;
            case "April":
                this.monthNumber = 4;
                break;
            case "May":
                this.monthNumber = 5;
                break;
            case "June":
                this.monthNumber = 6;
                break;
            case "July":
                this.monthNumber = 7;
                break;
            case "Augest":
                this.monthNumber = 8;
                break;
            case "September":
                this.monthNumber = 9;
                break;
            case "October":
                this.monthNumber = 10;
                break;
            case "November":
                this.monthNumber = 11;
                break;
            case "December":
                this.monthNumber = 12;
                break;
        }

    }

    public int getMonthNumber() {
        return monthNumber;
    }
}
