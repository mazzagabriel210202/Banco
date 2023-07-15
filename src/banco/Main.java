package banco;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Main {

	public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);
      
      System.out.println("informe o numero da conta");
      System.out.println("numero: ");
      int number = sc.nextInt();
      System.out.println("titular: ");
      sc.nextLine();
      String holder = sc.nextLine();
      System.out.println("saldo inicial: ");
      double balance = sc.nextDouble();
      System.out.println("limite de saque: ");
      double withdrawLimit = sc.nextDouble();
      
      Account acc = new Account(number, holder, balance, withdrawLimit);
      
      System.out.println();
      
      System.out.print("informe uma quantia para sacar: ");
      double amount = sc.nextDouble();
      
      acc.withdraw(amount);
      System.out.printf("novo saldo: %.2f%n", acc.getBalance());      
  
      sc.close();
	}

}
