import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        User user1= new User(1,"Kelvin","kelvin@gmail","Kelvin@2025");

//        System.out.println(user1.getFullname());
//        System.out.println(user1.getUserId());
//        System.out.println(user1);
//        System.out.println(user1.displayUserInfo());

        Account userAccount= new Account(1,
                123,user1.getUserId(),
                23456);

        System.out.println(userAccount.displayAccountInfo());





    }

}