import java.util.Scanner;

public class p460_BaseRaizDe10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String num;

        while(sc.hasNext()){
            num = sc.next();

            for(int i = 0; i<num.length();i++){
                if(i==num.length()-1){
                    System.out.print(num.charAt(i));
                }
                else{
                    System.out.print(num.charAt(i)+"0");
                }
            }
            System.out.println("");
        }
    }
}
