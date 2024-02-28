
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.zip.DataFormatException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author thang
 */
public abstract class EMPLOYEE implements IEMPLOYEE {

    String empid;
    String empName;
    Date EmpDateOfBirth;
    Date StartDate;

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Date getEmpDateOfBirth() {
        return EmpDateOfBirth;
    }

    public void setEmpDateOfBirth(Date EmpDateOfBirth) {
        this.EmpDateOfBirth = EmpDateOfBirth;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date StartDate) {
        this.StartDate = StartDate;
    }

    void input() {
       SimpleDateFormat dateformat = new SimpleDateFormat();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter enpid ");
        setEmpid(sc.nextLine());
        System.out.println("enter emp name ");
        setEmpName(sc.nextLine());
        try {
            System.out.println("enter EmpDateOfBirth DD/MM/YYYY");
            this.EmpDateOfBirth = dateformat.parse(sc.nextLine());
            System.out.println("enter StartDate DD/MM/YYYY");
            this.StartDate = dateformat.parse(sc.nextLine());
        } catch (Exception e) {
        }
    }

    void output() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("empid " + empid);
        System.out.println("empname " + empName);
        System.out.println("EmpDateOfBirth " + dateFormat.format(EmpDateOfBirth));
        System.out.println("StartDate " + dateFormat.format(StartDate));
    }

    int calculateSeniority() {
        int a = 2023 - StartDate.getDate();
        return a;
    }

}
