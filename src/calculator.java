import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        char operator;
        Double number1, number2, result;

        // Membuat Scanner class
        Scanner input = new Scanner(System.in);
        // minta pengguna untuk milih operasi
        System.out.println("Pilih Operasi : +, -, *, atau / ");
        operator = input.next().charAt(0);

        // minta paengguna untuk memasukan nomer
        System.out.println("Masukan Angka Pertama : ");
        number1 = input.nextDouble();

        System.out.println("Masukan Angka Kedua : ");
        number2 = input.nextDouble();

        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;
            case '/': 
                result = number1 / number2;
                System.out.println(number1+" / "+number2+" = "+result);
                break;
            default:
            System.out.println("Invalid Operasi");
                break;
        }
        input.close();
    }
}
