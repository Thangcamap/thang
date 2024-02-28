
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author thang
 */
public class EMP_LIST {

    ArrayList<EMPLOYEE> list = new ArrayList<>();

    void addnew() {
        EMPLOYEE em;
        Scanner sc = new Scanner(System.in);
        System.out.println("full/part");
        String chon = sc.nextLine().toLowerCase();
        switch (chon) {
            case "full":
                em = new EMP_FULLTIME();
                break;
            case "part":
                em = new EMP_PARTTIME();
                break;
            default:
                System.out.println("error");
                throw new AssertionError();
        }
        em.input();
        list.add(em);
    }

    void update(String empid) {
        for (EMPLOYEE em : list) {
            if (em.getEmpid().equals(empid)) {
                em.input();
                System.out.println("update thanh cong ");
                return;
            }
        }
        System.out.println("update khong thanh cong");
    }

    void delete(String empid) {
        for (EMPLOYEE em : list) {
            if (em.getEmpid().equals(empid)) {
                list.remove(em);
                System.out.println("delete thanh cong ");
                return;
            }
        }
        System.out.println("detete khong thanh cong");
    }

    void menu() {
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            for (EMPLOYEE em : list) {
                em.output();
            }
                System.out.println("---------------menu-------------------");
                System.out.println("1 addnew ");
                System.out.println("2 update ");
                System.out.println("3 delete ");
                System.out.println("0 exit");
                chon = sc.nextInt();
                String empidd = null;
                switch (chon) {
                    case 1:
                        addnew();
                        break;
                    case 2:
                        System.out.println("enter empid ");
                        sc.nextLine();
                        empidd = sc.nextLine();
                        update(empidd);
                        break;
                    case 3:
                        System.out.println("enter empid ");
                        sc.nextLine();
                        empidd = sc.nextLine();
                        delete(empidd);
                        break;
                    case 0:
                        return;
                    default:
                        throw new AssertionError();
                }
            }while (true);
        } 

    }


