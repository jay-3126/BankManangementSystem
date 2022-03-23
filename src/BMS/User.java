package BMS;

public class User {
    private int id;
    private String password;
    private String mobile;
    private double balance;

    User(int id, String password){
        this.id = id;
        this.password = password;
        this.balance = 1000;
    }

    public int getId(){
        return this.id;
    }

    public String getPassword(){
        return this.password;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public boolean verify(String password){
        return this.password.equals(password);
    }

}