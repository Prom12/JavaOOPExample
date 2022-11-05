public class User {
    public String email = "";
    public String id= "";
    public String names = "";
    public String contactNo = "";

    
    public void AccessWebsite(){
        System.out.println("Website Assessed");
    }

    private int Withdrawal(int value){
        int InitialTransac = 500;
        if(value > InitialTransac) return 0;
        InitialTransac = InitialTransac - value;
        return InitialTransac;
    }

    public int getWithdrawal(int value){
        return Withdrawal(value);
    }

}
