package MultipleInheritance;

public class student extends branch {
    String StudentName, Studentplace;
    int studentid;
    public student(String studentName, String studentplace, int studentid,String branchName, String collegename) {
        super(branchName,collegename);
        super.branchId=branchId;
        super.branchName=branchName;
        super.branchTotalstaff=branchTotalstaff;

        StudentName = studentName;
        Studentplace = studentplace;
        this.studentid = studentid;
    }

    

void display(){
    System.out.println("Student Details:");
    System.out.println("Name: "+StudentName);
    System.out.println("StudentId: "+studentid);
    System.out.println("BranchName: "+branchName);
    System.out.println("StudentPlace: "+Studentplace);
    System.out.println("Collegename "+collegename);

}
public static void main(String[] args) {
    student num1= new student("Aditya", "Solapur", 10, "CSE", "NKOCET");
    num1.display();
    college obj1=new college("NKCOET", "Solapur", 2);
    obj1.show();
    branch obj2=new branch("CSE", 2, 10);
    obj2.print();


    
    
}}
