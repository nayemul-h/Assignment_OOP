public class Main {
    public static void main(String[] args) {
        Student st= new Student(12345,"Nayem",new int[]{86,88,55});
        Student st1= new Student(23345,"XYZ",new int[]{35 ,56 ,78});
        Student st2= new Student(23545,"dfsYZ",new int[]{38, 55 ,88});


        st.calculateAverage(st.marks);
        st.printDetails();
        st1.calculateAverage(st1.marks);
        st1.printDetails();
        st2.calculateAverage(st2.marks);
        st2.printDetails();

    }
}

