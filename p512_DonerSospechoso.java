import java.util.Scanner;

public class p512_DonerSospechoso {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int casos=0;
        int con=0,cav=0,suma=0;
        casos=sc.nextInt();
        while(casos>0){
            con=sc.nextInt();
            cav=sc.nextInt();
            //Sumem els percentatges
            suma=con+cav;
            //Imprimim resultat dels % x 100 / la suma dels %
            System.out.println(con*100/suma);
            casos--;
        }
    }
}