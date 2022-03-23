package BMS;

import java.util.HashMap;

public class Bank {

    public HashMap<Integer, User> users;

    Bank() {
        users = new HashMap<>();
    }
    public void addUser(int id, String password) {

        User newUser = new User(id,password);

        if(users.containsKey(id)) {
            System.out.println("User Already Exists");
        }else {
            users.put(id,newUser);
            System.out.println("Account Successfully Created");
        }
    }

    public void sendMoney(int senderId, int receiverId, double amount){
       User sender = users.get(senderId);
       if(sender.getBalance() >= amount) {
           System.out.println("Transfering Money");
           User receiver = users.get(receiverId);

           sender.setBalance(sender.getBalance() - amount);
           receiver.setBalance(receiver.getBalance() + amount);

           System.out.println("Successfull");
           System.out.println("Remaining Balance : " + sender.getBalance());
       }else {
           System.out.println("Insufficient Balance");
       }
    }

    public boolean verify(int id, String password){
        User user = users.get(id);
        return user.verify(password);
    }

    public void addMoney(int id, double money){
        User userId = users.get(id);
        userId.setBalance(userId.getBalance() + money);
    }

    public double checkBalance(int id1){
        User checkId = users.get(id1);
        double bal = checkId.getBalance();
        return bal;
    }
}