package company.Main;

public class Main {

    public static void main(String[] args) {
        StudentSLL b = new StudentSLL();
        //String name, int id, double GPA, String Major
        Student a1 = new Student("Zaid Fisal", 20182453, 65, "Software Engineering");
        Student a2 =new Student("Khalid Alkurdi", 20211778, 83.7, "Software Engineering");
        Student a3 = new Student("Ahmad Mohammad", 20191600, 88, "Artificial intelligence");
        Student a4 = new Student("Jaraah Ahmad", 20211602, 76, "Doctor of Dentist");
        Student a5 = new Student("Bader Zaid", 20201250, 65, "Computer Science");
        Student a6 = new Student("Adnan Hashem", 20212001, 63, "Pharmacy");
        Student a7 = new Student("Rama Helal", 20191800, 74.8, "pharmacy");
        Student a8 = new Student("Ahmad Ahammad", 20215001, 77, "Software Engineering");
        Student a9 = new Student("Rawan Adnan", 20223034, 81, "Computer Science");
        Student a10 = new Student("Saja Ahmad", 20201801, 71.5, "Computer Science");
        Student a11 = new Student("Eman Ahmad", 20212000, 71.5, "Doctor of Dentist");
        Student a12 = new Student("Samera Ahmad", 20222020, 97, "Law Firm");
        b.AddStudent(a1);
        b.AddStudent(a2);
        b.AddStudent(a3);
        b.AddStudent(a4);
        b.AddStudent(a5);
        b.AddStudent(a6);
        b.AddStudent(a7);
        b.AddStudent(a8);
        b.AddStudent(a9);
        b.AddStudent(a10);
        b.AddStudent(a11);
        b.AddStudent(a12);
//**************************
        b.PrintAll();
//**************************
        Student t[];
        t = b.GetStudents("Software Engineering");
        //print student in array
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i].name+" : ");
            System.out.println(t[i].getId());
        }

        b.Print(20211778);
        System.out.println(b.FindStudent("Adnan hashem"));
        b.RemoveStudent(20201250);
        System.out.println("//////////////////////////////////////");
        b.PrintAll();

        System.out.println(b.FindStudent(20211778));
        b.FindTopOne();
        Student a13 = new Student("Rami Mohammad", 20211180, 99.9, "Doctor");
        b.AddStudent(a13);
        b.FindTopOne();

    }//end main
}//end class
