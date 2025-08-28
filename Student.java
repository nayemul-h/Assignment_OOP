import java.util.Arrays;

public class Student {
    int id;
    String name;
    int[] marks=new int[3];
    float average;

     Student(int id, String name, int[] marks)
    {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.average= average;


    }

    void calculateAverage(int[] mark)
    {
        int sum=0;
        for(int i=0;i<mark.length;i++)
        {
            sum+=mark[i];
        }
        float average=sum/mark.length;
        this.average=average;
    }

    void printDetails()
    {
        System.out.println("-----Student Details--------");
        System.out.println();
        System.out.println("Student ID: "+this.id);
        System.out.println("Student Name: "+this.name);
        System.out.println("Student Marks:");
        for(int i=0;i<marks.length;i++)
        {
            System.out.print(this.marks[i]+" ");
        }

        System.out.println("\nStudent Average: "+average);
    }



}
