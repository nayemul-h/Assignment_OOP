public class UndergraduateStudent extends Student {

    UndergraduateStudent(int roll,String name,String Department){
        super(roll,name,Department);
    }

    @Override
    double calculateGrade(int[] marks) {
        return super.calculateGrade(marks);
    }

    @Override
    void calculateGrade(double marks) {
        super.calculateGrade(marks);
    }

    @Override
    void participate(String x) {
        System.out.println("Student participated in "+x);

    }

    @Override
    void displayDetails() {
        super.displayDetails();
    }
}

