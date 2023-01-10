package MultipleInheritance;

public class college {
    String collegename , collegeplace;
    int collegeid;

    public college(String collegename, String collegeplace, int collegeid) {
        this.collegename = collegename;
        this.collegeplace = collegeplace;
        this.collegeid = collegeid;
    }

    public college(String collegename2) {
    }

    void show(){
        System.out.println("College Details");
        System.out.println("Name: "+collegename);
        System.out.println("Collge place is "+collegeplace);
        System.out.println("College id is "+collegeid);
    }
}
