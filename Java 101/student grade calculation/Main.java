package language.controlflowstatement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int count = 0;

        Scanner subMark = new Scanner(System.in);
        System.out.println("Enter a number of subjects: ");
        count = subMark.nextInt();
        System.out.println("Enter a marks of " + count + " subjects.");
        float totalMark = 0;
        float percentage = 0;

        for (int i = 0; i < count; i++) {
             totalMark += subMark.nextFloat();
        }
        System.out.println("Total Mark: " + totalMark);

         percentage = (totalMark/(count*100))*100;
        System.out.println("Student percentage: "+ percentage);

        switch ((int) (percentage/10)){
            case 9: case 10:
                System.out.println("Student Grade: A");
                break;
            case 8:
                System.out.println("Student Grade: B");
                break;
            case 7:
                System.out.println("Student Grade: C");
                break;
            case 6:
                System.out.println("Student Grade: D");
                break;
            default:
                System.out.println("Student Grade: Failed!");
        }
    }
    }


