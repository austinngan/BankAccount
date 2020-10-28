public class BankAccount{
  private double balance;
  private int accountID;
  private String password;
  public BankAccount(int id, String pw){
    balance=0.0;
    accountID=id;
    password=pw;
  }
  public int getAccountID(){
    return (accountID);
  }
  public double getBalance(){
    return (balance);
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
      balance=Math.round(balance*1000.0)/1000.0;
      return true;
    }
  }
  public boolean withdraw(double amount){
    if (amount>balance){
      return false;
    }
    if (amount<0){
      return false;
    }
    else{
      balance=balance-amount;
      balance=Math.round(balance*1000.0)/1000.0;
      return true;
    }
  }
  public String toString(){
    return ("#"+accountID+"\t$"+balance);
  }
  private boolean authenticate(String password){
    return this.password.equals(password);
  }
  public boolean transferTo(BankAccount other, double amount, String password){
      if (authenticate(password)&&withdraw(amount)){
        if (other.deposit(amount)){
          return true;
          }
      }
      else{
        System.out.println("CRITICAL ERROR!");
      }
      return false;
  }
}
