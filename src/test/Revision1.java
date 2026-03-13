package test;

public class Revision1 {
    private String bank;
    private int balance;
    private String branch;

    public static void main(String[] args){
        Revision1 r = new Revision1();
        r.setname("Bank of Baroda");
        System.out.println("Bank Name : " + r.getBank());

        r.setbalance(15000);
        System.out.println("Total Amount : " + r.getBalance());

        r.setBranch("Vijay Nagar");
        System.out.println("Branch Name : " + r.getBranch());

        Schools s = new Schools();
        s.setSchoolName("DAVV");
        System.out.println(s.getSchoolName());

    }

    public void setname(String s){
        bank = s;
    }

    public String getBank(){
        return bank;
    }

    public void setbalance(int a){
        balance = a;
    }

    public int getBalance(){
        return balance;
    }

    public void setBranch(String s){
        branch = s;
    }

    public String getBranch(){
        return branch;
    }
}

class Schools{
    private String SchoolName;

    public static void main(String[] args){

    }

    public void setSchoolName(String s){
        SchoolName = s;
    }
    public String getSchoolName(){
        return SchoolName;
    }
}