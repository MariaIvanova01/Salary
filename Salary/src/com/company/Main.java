package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);

        int numOpenTabs = scan.nextInt();
        int salary = scan.nextInt();
        String nameTab = "";

        for (int i = 0; i < numOpenTabs; i++){
            nameTab = scan.next();
            if (nameTab.equals("Facebook")){
                salary -=150;
            }else if (nameTab.equals("Instagram")){
                salary -=100;
            }else if (nameTab.equals("Reddit")){
                salary -=50;
            }
            if (salary == 0){
                System.out.println("You have lost your salary.");
                break;
            }
        }
        if (salary > 0){
            System.out.println(salary);
        }
    }
}
