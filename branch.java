package MultipleInheritance;

public class branch extends college{
    String branchName;
    int branchId,branchTotalstaff;
    public branch(String branchName, String collegename ) {
        super(collegename);
        super.collegename=collegename;
        super.collegeplace=collegeplace;
        super.collegeid=collegeid;
        this.branchName = branchName;
        
    }
    public branch(String branchName, int branchId , int branchTotalstaff){
        super(branchName, branchName, branchTotalstaff);

    }
    void print(){
        System.out.println("Branch Details:");
        System.out.println("branchName: "+branchName);
        System.out.println("BranchId"+branchId);
        System.out.println("Total staff "+branchTotalstaff);
    }
    
}
