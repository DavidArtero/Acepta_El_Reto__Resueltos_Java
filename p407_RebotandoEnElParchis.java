import java.util.Scanner;

public class p407_RebotandoEnElParchis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int posini,quant,dau,suma;

        quant=sc.nextInt();
        posini=sc.nextInt();
        dau=sc.nextInt();

        while(posini!=0 && quant!=0 && dau!=0){
            suma=posini+dau;
            if(suma<=quant){
                System.out.println(suma);
            }
            else{
                System.out.println(quant-(suma-quant));
            }
            quant=sc.nextInt();
            posini=sc.nextInt();
            dau=sc.nextInt();
        }
    }
}
