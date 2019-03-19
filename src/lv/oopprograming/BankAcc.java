package lv.oopprograming;

public class BankAcc {
    long accNumber;
    double balance;
    String customerName;
    String email;
    long phoneNumber;

    public BankAcc(){
        this("hey","edasd",1212112L);
        System.out.println("Empty Constructor creaded");
    }
    public BankAcc(String customerName, String email, long phoneNumber){
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public long getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(long accNumber) {
        this.accNumber = accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void depositBankAcc(double deposite){
        this.balance += deposite;
    }
    public void withdrawFunds(double withdraw){
        if(this.balance-withdraw<0){
            System.out.println("No money in bank ACC"+this.balance+" Available. Withdrawal not processed ");
        }else {
            this.balance -= withdraw;
            System.out.println("Withdrawal of "+withdraw + "processed. Remaining balanace = "+this.balance);
        }

    }
}
