public class BankAccount{
  private double balance;
  private int accountID;
  private String password;
  public BankAccount(int id, String pw){
    balance=0.0;
    accountID=id;
    password=pw;
  }
  public String getAccountID(){
    return ("The account ID is "+accountID);
  }
  public String getBalance(){
    return ("Your balance is $"+balance);
  }
  public void setPassword(String newPass){
    password=newPass;
  }
  public String getPassword(){
    return ("The password is "+password);
  }
  public boolean deposit(double amount){
    if (amount<0){
      return false;
    }
    else{
      balance=balance+amount;
      return true;
    }
  }
}
