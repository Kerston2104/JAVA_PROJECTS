package java_project_4;

import java.util.ArrayList;
import java.util.Scanner;

class Department {
    private String deptName;
    private String hodName;
    private int noOfFaculty;
    private int noOfStudents;
    private int noOfPrograms;

    public Department(String deptName, String hodName, int noOfFaculty, int noOfStudents, int noOfPrograms) {
        this.deptName = deptName;
        this.hodName = hodName;
        this.noOfFaculty = noOfFaculty;
        this.noOfStudents = noOfStudents;
        this.noOfPrograms = noOfPrograms;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getHodName() {
        return hodName;
    }

    public void setHodName(String hodName) {
        this.hodName = hodName;
    }

    public int getNoOfFaculty() {
        return noOfFaculty;
    }

    public void setNoOfFaculty(int noOfFaculty) {
        this.noOfFaculty = noOfFaculty;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public int getNoOfPrograms() {
        return noOfPrograms;
    }

    public void setNoOfPrograms(int noOfPrograms) {
        this.noOfPrograms = noOfPrograms;
    }

    @Override
    public String toString() {
        return "Department Name: " + deptName + "\nHOD Name: " + hodName +
                "\nNo. of Faculty: " + noOfFaculty + "\nNo. of Students: " + noOfStudents +
                "\nNo. of Programs: " + noOfPrograms + "\n";
    }
}

public class exno8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Department> departments = new ArrayList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Department");
            System.out.println("2. Edit Department");
            System.out.println("3. Delete Department");
            System.out.println("4. Display Departments");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    addDepartment(scanner, departments);
                    break;
                case 2:
                    editDepartment(scanner, departments);
                    break;
                case 3:
                    deleteDepartment(scanner, departments);
                    break;
                case 4:
                    displayDepartments(departments);
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    public static void addDepartment(Scanner scanner, ArrayList<Department> departments) {
        System.out.print("Enter Department Name: ");
        String deptName = scanner.nextLine();

        System.out.print("Enter HOD Name: ");
        String hodName = scanner.nextLine();

        System.out.print("Enter No. of Faculty: ");
        int noOfFaculty = scanner.nextInt();

        System.out.print("Enter No. of Students: ");
        int noOfStudents = scanner.nextInt();

        System.out.print("Enter No. of Programs: ");
        int noOfPrograms = scanner.nextInt();

        Department department = new Department(deptName, hodName, noOfFaculty, noOfStudents, noOfPrograms);
        departments.add(department);
        System.out.println("Department added successfully.");
    }

    public static void editDepartment(Scanner scanner, ArrayList<Department> departments) {
        System.out.print("Enter the Department Name to edit: ");
        String deptName = scanner.next();
        scanner.nextLine();  // Consume the newline character

        boolean found = false;
        for (Department department : departments) {
            if (department.getDeptName().equalsIgnoreCase(deptName)) {
                System.out.println("Enter new details for " + deptName + ":");
                System.out.print("New Department Name: ");
                department.setDeptName(scanner.nextLine());

                System.out.print("New HOD Name: ");
                department.setHodName(scanner.nextLine());

                System.out.print("New No. of Faculty: ");
                department.setNoOfFaculty(scanner.nextInt());

                System.out.print("New No. of Students: ");
                department.setNoOfStudents(scanner.nextInt());

                System.out.print("New No. of Programs: ");
                department.setNoOfPrograms(scanner.nextInt());

                System.out.println("Department updated successfully.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Department not found.");
        }
    }

    public static void deleteDepartment(Scanner scanner, ArrayList<Department> departments) {
        System.out.print("Enter the Department Name to delete: ");
        String deptName = scanner.next();
        scanner.nextLine();  // Consume the newline character

        boolean removed = departments.removeIf(department -> department.getDeptName().equalsIgnoreCase(deptName));
        if (removed) {
            System.out.println("Department deleted successfully.");
        } else {
            System.out.println("Department not found.");
        }
    }

    public static void displayDepartments(ArrayList<Department> departments) {
        if (departments.isEmpty()) {
            System.out.println("No departments found.");
        } else {
            System.out.println("Department Details:");
            for (Department department : departments) {
                System.out.println(department);
            }
        }
    }
}
