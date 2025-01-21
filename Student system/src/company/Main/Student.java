package company.Main;

public class Student {
    public String name;
    private int id;
    public String Major;
    private double GPA;
    //**************************************************************************
    public Student(String name, int id, double GPA, String Major) {
        this.name = name;
        setId(id);
        setGPA(GPA);
        this.Major= Major;
    }
    //***************************************************************************
    public void setId(int id) {
            //8 digits
            String d=id+"";
            if(d.length()!=8){
                System.out.println(" id incorect because id is not 8 digits");
                this.id=-999999;
            }
            else{
                this.id = id;
            }
    }

    public void setGPA(double GPA) {
            // GPA less or equl 4 and more or equl than 0
            if(GPA>=50 && GPA<=100){
                this.GPA = GPA;
            }
            else{
                System.out.println("GPA incorect");
                this.GPA=-999999;
            }
    }
    //****************************************************************************
    public int getId() {
        return id;
    }

    public double getGPA() {
        return GPA;
    }
    //****************************************************************************
    @Override
    public String toString() {
        return "---------------------\n"+ "name  : " + name +
                "\nid    : " + id +
                "\nMajor : " + Major +
                "\nGPA   : " + GPA +"\n---------------------";
    }




}
