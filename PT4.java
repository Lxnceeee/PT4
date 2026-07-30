import java.io.*;

public class PT4 {

public static void main(String[] args) throws IOException {

BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

double balance = 5000.0;
int choice;

while (true) {

System.out.println("====== // * ATM * // ======");
System.out.println("1. Check Balance");
System.out.println("2. Deposit");
System.out.println("3. Withdraw");
System.out.println("4. Exit");
System.out.print("Enter your choice: ");
choice = Integer.parseInt(r.readLine());
System.out.println();

if (choice == 1) {

System.out.println("Current balance: " + balance);

}
else if (choice == 2) {

System.out.print("Enter deposit amount: ");
double deposit = Double.parseDouble(r.readLine());
System.out.println();

balance += deposit;

System.out.println("Deposit successful.");
System.out.println("New balance: " + balance);

}
else if (choice == 3) {

System.out.print("Enter withdraw amount: ");
double withdraw = Double.parseDouble(r.readLine());
System.out.println();

if (withdraw <= balance) {
balance -= withdraw;
System.out.println("Withdraw successful.");
System.out.println("Remaining balance: " + balance);
}
else {
System.out.println("Insufficient balance.");
}

}
else if (choice == 4) {

System.out.println("Exiting...");
System.out.println();
System.out.println("Thank you for using our ATM!");
break;

}
else {

System.out.println("Invalid choice.");

}

System.out.println();
System.out.println("------------------------------");
System.out.println();

}

}
}