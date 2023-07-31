package exercicio_vetor;

import java.util.Scanner;

import exercicio_vetor2.height;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many people are you going to cadaster?\n ");
        int n = sc.nextInt();

        height[] vect = new height[n];

        for (int i = 0; i < vect.length; i++) {

            sc.nextLine();
            System.out.println("What is the name?\n");
            String name = sc.nextLine();
            System.out.println("What is the age?\n");
            int age = sc.nextInt();
            System.out.println("What is the height?\n");
            double height = sc.nextDouble();
            vect[i] = new height(name, age, height);
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum = sum + vect[i].getHeight();
        }

        double t = 0;

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getAge() < 16) {
                t += 1;             

            }
        }

        double avg = sum / n;
        System.out.printf("The average height is %.2f\n\n", avg);

        double p = (t/n) *100;
        System.out.printf("%.2f percent of the people has less than 16 years, they are:\n\n" , p);

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getAge() < 16) {
                System.out.println(vect[i].getName());
            }

    }

    sc.close();

}
}
