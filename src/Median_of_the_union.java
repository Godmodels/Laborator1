public class Median_of_the_union {
    import java.util.*;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            int N = scanner.nextInt();
            int L = scanner.nextInt();


            int[][] sequences = new int[N][L];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < L; j++) {
                    sequences[i][j] = scanner.nextInt();
                }
            }


            StringBuilder result = new StringBuilder();
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    result.append(findMedian(sequences[i], sequences[j], L)).append(" ");
                }
            }


            System.out.println(result.toString().trim());

            scanner.close();
        }


        private static int findMedian(int[] seq1, int[] seq2, int L) {
            int i = 0, j = 0, count = 0;
            int median = 0;


            while (count < L) {
                if (i < seq1.length && (j >= seq2.length || seq1[i] <= seq2[j])) {
                    median = seq1[i];
                    i++;
                } else {
                    median = seq2[j];
                    j++;
                }
                count++;
            }

            return median;
        }
    }
}
