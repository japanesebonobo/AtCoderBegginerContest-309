import java.util.*;

public class B_Rotate  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        char A[][] = new char[N][N];
        char B[][] = new char[N][N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.next().toCharArray();
        }
        scanner.close();
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0 && j == 0) {
                    B[i][j] = A[1][0];
                } else if (i == 0 && j != 0) {
                    B[i][j] = A[i][j-1];
                } else if (j == N-1) {
                    B[i][j] = A[i-1][j];
                } else if (i == N-1) {
                    B[i][j] = A[i][j+1];
                } else if (j == 0) {
                    B[i][j] = A[i+1][j];
                } else  {
                    B[i][j] = A[i][j];
                }
                System.out.print(B[i][j]);
            }
            System.out.println();
        }
    }
}

