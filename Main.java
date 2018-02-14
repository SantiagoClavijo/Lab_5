import java.util.Scanner;

public class Main {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        String hexadecimal;
        String hexadecimalLowerCase;

        System.out.print("Enter a hexadecimal number: ");
        hexadecimal = scanner.nextLine();
        hexadecimalLowerCase = hexadecimal.toLowerCase();

        int i = 0;
        char letter;
        long decimalNumber = 0;
        int power = hexadecimalLowerCase.length() - 1;
        long digit;
        int  a = 0;
        int b = 0;

        while(i < hexadecimalLowerCase.length()) {

            if(hexadecimalLowerCase.charAt(0) == '0' && hexadecimalLowerCase.charAt(1) == 'x') {
                power = hexadecimalLowerCase.length() - 3 - b;
                i = 2;
                i = i + a;
                letter = hexadecimalLowerCase.charAt(i);

                if(letter == 'a')
                    decimalNumber += 10 * Math.pow(16, power);
                else if(letter == 'b')
                    decimalNumber += 11 * Math.pow(16, power);
                else if(letter == 'c')
                    decimalNumber += 12 * Math.pow(16, power);
                else if(letter == 'd')
                    decimalNumber += 13 * Math.pow(16, power);
                else if(letter == 'e')
                    decimalNumber += 14 * Math.pow(16, power);
                else if(letter == 'f')
                    decimalNumber += 15 * Math.pow(16, power);
                else {
                    digit = (long) letter;
                    decimalNumber += (digit - 48) * Math.pow(16, power);
                }
                a++;
                b++;
            }

            else {

                letter = hexadecimalLowerCase.charAt(i);

                if (letter == 'a')
                    decimalNumber += 10 * Math.pow(16, power);
                else if (letter == 'b')
                    decimalNumber += 11 * Math.pow(16, power);
                else if (letter == 'c')
                    decimalNumber += 12 * Math.pow(16, power);
                else if (letter == 'd')
                    decimalNumber += 13 * Math.pow(16, power);
                else if (letter == 'e')
                    decimalNumber += 14 * Math.pow(16, power);
                else if (letter == 'f')
                    decimalNumber += 15 * Math.pow(16, power);
                else {
                    digit = (long) letter;
                    decimalNumber += (digit - 48) * Math.pow(16, power);
                }

            }
            i++;
            power--;
        }

        System.out.println("Your number is " + decimalNumber + " in decimal");

    }


}
