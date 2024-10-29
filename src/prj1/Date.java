/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prj1;

/**
 *
 * @author homin
 */
public class Date {
    private int Day;
    private int Month;
    private int Year;

    public Date(int Day, int Month, int Year) {
        if (Day >=1 && Day <= 31){
            this.Day = Day;
        }
        else this.Day = 1;
        
        if (Month >=1 && Month <= 12){
            this.Month = Month;
        }
        else this.Month = 1;
        
        if (Year >= 0){
            this.Year = Year;
        }
        else this.Year = 1;
        
        
    }

    public int getDay() {
        return Day;
    }

    public void setDay(int Day) {
        if (Day >= 1 && Day <= 31)
        this.Day = Day;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int Month) {
        if (Month >= 1 && Month <= 12)
        this.Month = Month;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        if (Year > 0)
        this.Year = Year;
    }
    

    
    public void printDay(){
        System.out.println("Day: " + this.Day);
    }
    
    public void printMonth(){
        System.out.println("Month: " + this.Month);
    }
    
    public void printYear(){
        System.out.println("Year: " + this.Year);
    }
    
    public void printDate(){
        System.out.println("Date: " + this.Day + "-" + this.Month + "-" + this.Year);
    }
}

