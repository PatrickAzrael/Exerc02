import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float num;
        System.out.println("Informe um número: ");
        num = leia.nextFloat();
        System.out.println("O número informado foi: " + num);
        leia.close();
    }

}