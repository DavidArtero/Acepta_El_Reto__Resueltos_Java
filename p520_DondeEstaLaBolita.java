import java.util.Scanner;

public class p520_DondeEstaLaBolita {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int posact,quant,pos1,pos2;

        quant=sc.nextInt();
        posact=sc.nextInt();
        while(quant!=0 && posact!=0){
            pos1=1;
            pos2=1;

                while(pos1!=0 && pos2!=0){
                pos1=sc.nextInt();
                pos2=sc.nextInt();

                if(posact==pos1){
                    posact=pos2;
                }
                else if(posact==pos2){
                        posact=pos1;
                    }
            }
            System.out.println(posact);
            quant=sc.nextInt();
            posact=sc.nextInt();
        }
    }
}
