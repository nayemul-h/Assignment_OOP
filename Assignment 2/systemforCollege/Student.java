public class Student {

    int roll;
    String name;
    String Department;

    Student(int roll, String name, String Department) {
        this.roll = roll;
        this.name = name;
        this.Department = Department;
    }

    void calculateGrade(double marks) {
        if (marks >= 0 && marks <= 100) {
            if (marks > 90) {
                System.out.println("Your grade is A");
            } else if (marks < 90 && marks >= 86) {
                System.out.println("Your grade is A-");
            } else if (marks < 86 && marks >= 82) {
                System.out.println("Your grade is B+");
            } else if (marks < 82 && marks >= 78) {
                System.out.println("Your grade is B");
            } else if (marks < 78 && marks >= 74) {
                System.out.println("Your grade is B-");
            } else if (marks < 74 && marks >= 70) {
                System.out.println("Your grade is C+");
            } else if (marks < 70 && marks >= 66) {
                System.out.println("Your grade is C");
            } else if (marks < 66 && marks >= 62) {
                System.out.println("Your grade is C-");
            } else if (marks < 62 && marks >= 58) {
                System.out.println("Your grade is D+");
            } else if (marks < 58 && marks >= 55) {
                System.out.println("Your grade is D");
            } else if (marks < 55) {
                System.out.println("Your grade is F");
            }
        } else System.out.println("Invalid Marks");
    }


    double calculateGrade(int[] marks) {
        double sum = 0;
        for (int i : marks) {
            sum += i;
        }
        double average = sum / marks.length;


        return average;
    }

    void participate(String x){
        System.out.println("Student participates in general activities");
    }

    void displayDetails() {
        System.out.println("------Student details-------");
        System.out.println("Roll No: " + this.roll);
        System.out.println("Name: " + this.name);
        System.out.println("Department: " + this.Department);
    }
}
