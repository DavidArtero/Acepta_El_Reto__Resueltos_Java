import java.util.Scanner;

public class p403_EnCamposDeFutbol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nCasos = sc.nextInt();
        int metresQ, nCamps;
        int minCamp = 45 * 90;
        int maxCamp = 90 * 120;
        boolean possible;
            for (int i = 0; i < nCasos; i++) {
                metresQ = sc.nextInt();
                nCamps = sc.nextInt();

                if (minCamp <= metresQ/nCamps && maxCamp >= metresQ/nCamps) {
                    possible = true;}
                 else {
                    possible = false;
                }

                if (possible) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
