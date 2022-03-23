package BMS;
import java.util.*;

public class StartPage {
    public static void main(String args[]) {

        Bank bank = new Bank();

        System.out.println("Welcome to Bank Management System");

        int option;

        do{
            System.out.println("Enter 1 to Login");
            System.out.println("Enter 2 to Create New Account");
            System.out.println("Enter 0 to Exit");

            Scanner sc = new Scanner(System.in);

            int id;
            String password;

            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter id: ");
                    id = sc.nextInt();
                    System.out.println("Enter Password: ");
                    password = sc.next();
                    boolean check = bank.verify(id,password);
                    if(check){
                        System.out.println("Login Succesfully");
                        int press;
                        do{

                            System.out.println("Enter 1 to Check balance");
                            System.out.println("Enter 2 to Send Money");
                            System.out.println("Enter 3 to Add Money");
                            System.out.println("Enter 0 to Exit");
                            press = sc.nextInt();
                            if(press == 1) {
                                System.out.println(bank.checkBalance(id));
                            }else if(press == 2) {
                                System.out.println("Transfer to: ");
                                int receiverId = sc.nextInt();
                                System.out.println("Enter Amount: ");
                                double money = sc.nextDouble();
                                bank.sendMoney(id,receiverId,money);
                            }else if(press == 3) {
                                System.out.println("Enter Amount");
                                double add = sc.nextInt();
                                bank.addMoney(id,add);
                                System.out.println("Money Added Successfully");
                            }else{
                                System.out.println("Thank You, visit again");
                            }
                        }while(press != 0);

                    }else{
                        System.out.println("Bad Credentials");
                    }
                    break;
                case 2:
                    System.out.print("Enter your Id: ");
                    id = sc.nextInt();
                    System.out.print("Enter your Password: ");
                    password = sc.next();
                    bank.addUser(id, password);
                    break;
                default:
                    System.out.println("Thankyou for banking with us, Please visit again");
            }
        }while(option != 0);

    }
}
