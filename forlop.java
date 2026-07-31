import java.io.*;
 
public class forlop {
 
public static void main (String [] args) throws IOException {
 
BufferedReader r = new BufferedReader (new InputStreamReader (System.in));
System.out.print("for loop Pyramid asterisk");

System.out.print("\nEnter the number of lines: ");
int lines = Integer.parseInt(r.readLine());

for (int i = 1; i <= lines; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
}}
