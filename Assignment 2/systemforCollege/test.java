import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UndergraduateStudent[] us= new UndergraduateStudent[3];
        GraduateStudent[] gs= new GraduateStudent[3];
        int[] marks= new int[3];

        int tempRoll;
        String tName;
        String tDepartment;
        int choice,i=0,j=0,tChoice,stu=0,k=0;
        double x;
        String club,seminar;

        while(true){
            System.out.println("1. Undergraduate Student\n2. Graduate Student");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("1. Add student(for only 3 students)\n2.Update grade of student\n3.Update participation of Student\n4.Student Details\n");
                    System.out.println("Enter your choice");
                    tChoice= sc.nextInt();
                    switch(tChoice){
                        case 1:
                            System.out.println("Enter Student Roll Number:");
                            tempRoll = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Enter Student Name:");
                            tName = sc.nextLine();
                            System.out.println("Enter Student Department:");
                            tDepartment = sc.nextLine();
                            us[i]=new  UndergraduateStudent(tempRoll,tName,tDepartment);
                            i++;
                            break;
                            case 2:
                                System.out.println("Enter the Student number of whom you want to update the grade:");
                                stu = sc.nextInt();
                                System.out.println("Enter the marks of the student(3 subject):");
                                for(j=0;j<marks.length;j++){
                                    marks[j]=sc.nextInt();
                                }
                                x=us[stu-1].calculateGrade(marks);
                                us[stu-1].calculateGrade(x);
                                break;
                        case 3:
                            System.out.println("Enter Student Number:");
                            stu = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Enter the club name in which the student participates:");

                            club = sc.nextLine();
                            us[stu-1].participate(club);
                            break;
                            case 4:
                                System.out.println("Enter student number:");
                                stu=sc.nextInt();
                                us[stu-1].displayDetails();
                                break;






                    }
                    break;
                    case 2:
                        System.out.println("1. Add student(for only 3 students)\n2.Update grade of student\n3.Update participation of Student\n4.Student Details");
                        System.out.println("Enter your choice");
                        tChoice= sc.nextInt();
                        switch(tChoice){
                            case 1:
                                System.out.println("Enter Student Roll Number:");
                                tempRoll = sc.nextInt();
                                sc.nextLine();
                                System.out.println("Enter Student Name:");
                                tName = sc.nextLine();
                                System.out.println("Enter Student Department:");
                                tDepartment = sc.nextLine();
                                gs[k]=new  GraduateStudent(tempRoll,tName,tDepartment);
                                k++;
                                break;
                            case 2:
                                System.out.println("Enter the Student number of whom you want to update the grade:");
                                stu = sc.nextInt();
                                System.out.println("Enter the marks of the student(3 subject):");
                                for(j=0;j<marks.length;j++){
                                    marks[j]=sc.nextInt();
                                }
                                x=gs[stu-1].calculateGrade(marks);
                                gs[stu-1].calculateGrade(x);
                                break;
                            case 3:
                                System.out.println("Enter Student Number:");
                                stu = sc.nextInt();
                                sc.nextLine();
                                System.out.println("Enter the Seminar name in which the student participates:");
                                seminar = sc.nextLine();
                                gs[stu-1].participate(seminar);
                                break;
                            case 4:
                                System.out.println("Enter student number:");
                                stu=sc.nextInt();
                                gs[stu-1].displayDetails();
                                break;





                        }
                        break;


            }
        }






    }
}
