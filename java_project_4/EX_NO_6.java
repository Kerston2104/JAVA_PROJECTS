package java_project_4;

import java.util.Scanner;

class Student {
    private String name;
    private String registerNo;
    private String department;
    private double cgpa;

    public Student(String name, String registerNo, String department, double cgpa) {
        this.name = name;
        this.registerNo = registerNo;
        this.department = department;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public String getRegisterNo() {
        return registerNo;
    }

    public String getDepartment() {
        return department;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class EX_NO_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[100];
        int studentCount = 0;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    if (studentCount < students.length) {
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Register No: ");
                        String registerNo = scanner.nextLine();
                        System.out.print("Enter Department: ");
                        String department = scanner.nextLine();
                        System.out.print("Enter CGPA: ");
                        double cgpa = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline

                        students[studentCount] = new Student(name, registerNo, department, cgpa);
                        studentCount++;
                        System.out.println("Student added successfully.");
                    } else {
                        System.out.println("Maximum student limit reached.");
                    }
                    break;
                case 2:
                    System.out.println("\nStudent Details:");
                    for (int i = 0; i < studentCount; i++) {
                        Student student = students[i];
                        System.out.println("Name: " + student.getName());
                        System.out.println("Register No: " + student.getRegisterNo());
                        System.out.println("Department: " + student.getDepartment());
                        System.out.println("CGPA: " + student.getCgpa());
                        System.out.println("---------------------");
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
