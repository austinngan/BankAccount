public class BankAccount{
  private double balance;
  private int accountID;
  private String password;
  public BankAccount(int id, String pw){
    balance=0.0;
    accountID=id;
    password=pw;
  }
  public String getID(){
    return ("The account ID is "+accountID);
  }
  public String getBal(){
    return ("Your balance is $"+balance);
  }
}
