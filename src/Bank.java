public class Bank {
    public static void main(String[] args) throws Exception {
            Staff staff1 = new Staff();
            Customers customer1 = new Customers();
            staff1.AccessWebsite();
            staff1.email = "nanaama@ug.edu.gh";
            staff1.staffNo = "78996541230";

            System.out.println("Staff");
            System.out.println(staff1.email);
            System.out.println(staff1.staffNo);
            System.out.println(staff1.getWithdrawal(200));
            System.out.println("Customer");
            System.out.println(customer1.getWithdrawal(500));
        
    }
}
