import java.util.Scanner;

public class tinhtong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap N: ");
        int N = scanner.nextInt();
        int S = 0;
        for (int i = 1; i <= N; i++) {
            String numStr = i + "" + i; 
            int NN = Integer.parseInt(numStr); 
            S += NN;
        }
        System.out.println("Tong S = " + S);
    }
}
