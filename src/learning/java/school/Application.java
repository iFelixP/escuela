package learning.java.school;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Student []student = new Student[]{
                // Inicializando el arreglo
                new Student("Alaín","1"),
                new Student("Israel","2"),
                new Student("Jocelyn","3"),
                new Student("Hugo","4")
        };
        int []asistencia = new int [student.length];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Los alumnos son...");

        for(int i = 0 ; i < student.length; i++) {

            System.out.println(student[i].getName() + " - " + student[i].getCode());

            System.out.print("Asistió?: ");
            String response = scanner.next("[YNyn]");

            // System.out.println(student[i].getName() + (response.equalsIgnoreCase("Y")? " si" : " no"));

            if (response.equalsIgnoreCase("Y")){
                asistencia[i]=1;
            }else{
                asistencia[i]=0;
            }
        }
        for(int i = 0; i < student.length ; i++) {
            System.out.print(student[i].getName() + " - ");
            if(asistencia[i] == 1) {
                System.out.println("Sí asistió");
            }else{
                System.out.println("No asistió");
            }
        }
    }
}