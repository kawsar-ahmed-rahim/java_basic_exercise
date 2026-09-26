import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        if (temp >= 30) System.out.println("Hot");
        else if (temp >= 20) System.out.println("Warm");
        else System.out.println("Cold");
    }
}