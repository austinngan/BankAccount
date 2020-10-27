public class BankTester{
  public static void main(String[]args){
    BankAccount a1=new BankAccount(68416516, "981754AF165");
    System.out.println(a1.getAccountID());
    System.out.println(a1.getBalance());
    System.out.println(a1.getPassword());
    a1.setPassword("718423hF2");
    System.out.println(a1.getPassword());
    a1.deposit(1423.33);
    System.out.println(a1.getBalance());
  }
}
