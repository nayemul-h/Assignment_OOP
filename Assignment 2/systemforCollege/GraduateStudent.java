public class GraduateStudent extends Student{


    GraduateStudent(int roll, String name, String Department){
        super(roll,name,Department);
    }

    @Override
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
            } else if (marks < 62) {
                System.out.println("Your grade is F");

            }
        } else System.out.println("Invalid Marks");
    }



    @Override
    void participate(String x) {
        System.out.println("Student participated in "+x+" research seminar");
    }

    @Override
    double calculateGrade(int[] marks) {
        return super.calculateGrade(marks);
    }

    @Override
    void displayDetails() {
        super.displayDetails();
    }
}
