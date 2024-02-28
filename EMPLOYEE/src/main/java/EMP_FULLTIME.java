
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thang
 */
public class EMP_FULLTIME extends EMPLOYEE{
    double coefficients_salary;

    public double getCoefficients_salary() {
        return coefficients_salary;
    }

    public void setCoefficients_salary(double coefficients_salary) {
        this.coefficients_salary = coefficients_salary;
    }
    

    @Override
    public double CalculateSalary() {
        return BASIC_SALARY * coefficients_salary + CalculateAllowance();
    }

    @Override
    public double CalculateAllowance() {
        if(calculateSeniority()>=10){
            return 1000000;
        }
        else if(calculateSeniority()>=5){
            return 500000;
        }
        return 0;
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("enter coefficients_salary");
        setCoefficients_salary(sc.nextDouble());
    }
    void output(){
        super.output();
        System.out.println("coefficients_salary"+coefficients_salary);
    }
    
    
}
