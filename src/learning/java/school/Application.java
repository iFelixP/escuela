package learning.java.school;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Student []student = new Student[]{
                /* Inicializando el arreglo */
                new Student("Isaias","1"),
                new Student("Edgar","2"),
                new Student("Alain","3"),
                new Student("Caleb","4")
        };

        Scanner scanner = new Scanner(System.in);

        System.out.println("Los alumnos son...");

        for(int i = 0 ; i < student.length; i++) {

            System.out.println(student[i].getName() + " - " + student[i].getCode());

            System.out.print("Asistió?: ");
            String response = scanner.next("[YNyn]");

            System.out.println(student[i].getName() + (response.equalsIgnoreCase("Y")? " si" : " no"));
        }
    }
}