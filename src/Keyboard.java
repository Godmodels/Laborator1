import java.util.*;

public class Keyboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();


        int[] durability = new int[n];
        for (int i = 0; i < n; i++) {
            durability[i] = scanner.nextInt();
        }


        int k = scanner.nextInt();


        int[] presses = new int[k];
        for (int i = 0; i < k; i++) {
            presses[i] = scanner.nextInt();
        }


        int[] keyPressCount = new int[n];
        for (int press : presses) {
            keyPressCount[press - 1]++; // 
        }


        for (int i = 0; i < n; i++) {
            if (keyPressCount[i] > durability[i]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}