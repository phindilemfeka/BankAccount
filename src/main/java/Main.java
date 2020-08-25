import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        BankAccount enc = new BankAccount(0, UUID.randomUUID(),1.50);
        enc.setName("Abongile");
        System.out.println("Name: "+enc.getName());
        enc.setSurname("August");
        System.out.println("Surname: "+enc.getSurname());
        enc.setIdNumber(8811261003085L);
        System.out.println("I.D number: "+enc.getIdNumber());
        System.out.println("*****************************************************************************************************************************************************************");
        System.out.println();
        int counter =1;

        System.out.println("Enter 1 to deposit\n      2 to withdraw\n      3 to check balance\n " +
                "     4 to deposit and withdraw");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        if (input==1) {
            System.out.println(enc.deposit());
        }
        else if (input==2)
            System.out.println(enc.withdraw());

        else if (input==3)
            System.out.println(enc.checkBalance());

        else if (input==4)
            System.out.println(enc.deposit());
            System.out.println(enc.withdraw());

            enc.interestRate(0.54);
    }

}


