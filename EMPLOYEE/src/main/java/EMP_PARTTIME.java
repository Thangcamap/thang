
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thang
 */
public class EMP_PARTTIME extends EMPLOYEE{
    int number_of_workdays;

    public int getNumber_of_workdays() {
        return number_of_workdays;
    }

    public void setNumber_of_workdays(int number_of_workdays) {
        this.number_of_workdays = number_of_workdays;
    }
    

    @Override
    public double CalculateSalary() {
       return BASIC_SALARY*number_of_workdays/26+CalculateAllowance();
    }

    @Override
    public double CalculateAllowance() {
       if(calculateSeniority()>=10){
           return 500000;
       }
       else if(calculateSeniority()>=5){
           return 300000;
       }
       return 0;
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("number_of_workdays");
        setNumber_of_workdays(sc.nextInt()); 
    }
    void output(){
        super.output();
        System.out.println("number_of_workdays"+number_of_workdays);
    }
    
    
}
