import java.util.*;

public class A_Nine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();
        
        String ans = "No";
        if (B - A == 1) {
            if (A != 3 && A != 6 && A != 9) {
                ans = "Yes";
            }
        }
        System.out.println(ans);
    }
}

