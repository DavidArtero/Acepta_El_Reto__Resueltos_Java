import java.util.Scanner;

public class p239_Pi {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int diaspitido, horas, minutos;

        while(true) {
            int dias = entrada.nextInt();
            int emisoras=entrada.nextInt();

            if(dias==0&&emisoras==0) {
                break;
            }

            //El total de segons són els dies * les emisores * 6 segons que duren * 24 hores que té un dia
            int totalSegundosAldia = dias*emisoras*144;


            diaspitido= totalSegundosAldia/86400;
            totalSegundosAldia%=86400;

            horas = totalSegundosAldia/3600;
            totalSegundosAldia%=3600;

            minutos  = totalSegundosAldia/60;
            totalSegundosAldia%=60;


            //Per printar amb format requerit:
            System.out.printf("%01d:%02d:%02d:%02d\n",diaspitido,horas,minutos,totalSegundosAldia);
        }
    }
}

