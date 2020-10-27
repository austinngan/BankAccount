public class BankAccount{
  private double balance;
  private int accountID;
  private String password;
  public BankAccount(int id; String pw){
    balance=0.0;
    accountID=id;
    password=pw;
  }
  public int getID(){
    return ("The account ID is "+accountID);
  }
  public double getBal(){
    return ("Your balance is $"+balance);
  }
}
