import java.util.Scanner;
public class SomaImpares {
    public static void main(String[]args){
        Scanner imput = new Scanner(System.in);
        System.out.print("Digite o valor inicial: ");
        inicio=imput.nextInt();
        System.out.print("digite o valor final: ");
        fim = imput.nextInt();
        if(inicio>fim){
            System.out.println("Intervalor de valores invalidos");
            return;
        }
        for (int i = inicio; i<=fim;i++){
            if(i%2!=0) {
                soma += i;
            }
            }
        System.out.println(" a soma dos valores impares sao"["inicio+","fim +"] é "+soma");

    }
}

