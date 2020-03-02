import java.util.Scanner;

public class p515_PoniendoLaMesa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cas=sc.nextInt();
        int cont;
        boolean duo;
        //Hasta que no nos pasen un 0 repetiremos el bucle
        while(cas!=0){
            //Ponemos el controlador de las copas que me llevaré de 2 en 2 como falso
            duo=false;
            cont=0;
                /*hasta llegar a 0 o negativo en caso de ser pares los vasos de la mesa restamos -1
                   ya que nunca coincidirá en que sean pares y x tanto nunca me llevaré 2 de un viaje*/
                 if(cas%2==0) {
                     while (cas > 0) {
                         cas = cas - 1;
                         cont++;
                     }
                 }
                     /*en el caso de los impares descubrí que solamente una vez me llevaría 2 vasos, tenga la cantidad
                      que tenga el valor de cas*/
                 else if(cas%2!=0){
                         while (cas > 0) {
                             if(!duo){
                                 cas=cas-2;
                                 cont++;
                                 duo=true;
                             }
                             else {
                                     cas=cas-1;
                                     cont++;

                         }
                     }
                 }
            System.out.println(cont);
            cas=sc.nextInt();
        }
    }
}
