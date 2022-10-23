import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        systemHour();

        Scanner firstNumber = new Scanner(System.in);
        double fNumber;
        Scanner secondNumber = new Scanner(System.in);
        double sNumber;

        String nome = myName();
        System.out.println("ola " + nome + " seja bem vindo");
        System.out.println("Informe o primeiro numero : ");
        fNumber = Double.parseDouble(firstNumber.nextLine());
        System.out.println("Informe o segundo numero : ");
        sNumber = Double.parseDouble(secondNumber.nextLine());
        calcBasicOperations(fNumber, sNumber);
    }

    public static void calcBasicOperations(double preco1, double preco2) {
        double sum = preco1 + preco2;
        double sub = preco1 - preco2;
        double multi = preco1 * preco2;
        double div = preco1 / preco2;
        System.out.println("A soma dos numeros e igual a " + sum);
        System.out.println("A subracao dos numeros e igual a " + sub);
        System.out.println("A multiplicacao dos numeros e igual a " + multi);
        System.out.println("A divisao dos numeros e igual a " + div);
    }

    public static void systemHour() {
        Date novoHorario = new Date();
        String hora = new SimpleDateFormat("HH:mm:ss").format(novoHorario);
        int h = Integer.parseInt(hora.substring(0, 1));
        if (h >= 6 && h <= 12) {
            System.out.println("Bom Dia");
        } else if (h >= 13 && h < 19){
            System.out.println("Boa Tarde");
        } else {
            System.out.println("Boa Noite");
        }
    }

    public static  String myName() {
        Scanner name = new Scanner(System.in);
        String nome;
        System.out.println("Informe o seu nome : ");
        nome = name.nextLine();
        return nome;
    }
}