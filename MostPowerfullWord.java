import java.util.Scanner;

public class MostPowerfullWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int max = Integer.MIN_VALUE;
        String winner = "";

        while (!input.equals("End of words")) {
            int sum = 0;

            for (int i = 0; i < input.length(); i++) {
                char a = input.charAt(i);
                int b = (int) a;
                sum += b;

            }
            if (input.charAt(0) == 'a' || input.charAt(0) == 'e' || input.charAt(0) == 'i' || input.charAt(0) == 'o' || input.charAt(0) == 'u' || input.charAt(0) == 'y'
                    || input.charAt(0) == 'A' || input.charAt(0) == 'E' || input.charAt(0) == 'I' || input.charAt(0) == 'O' || input.charAt(0) == 'U' || input.charAt(0) == 'Y') {
                sum *= input.length();
            } else {
                sum /= Math.ceil(input.length());
            }

            if (sum > max) {
                max = sum;
                winner = input;
            }
            input = scanner.nextLine();


        }

        System.out.printf("The most powerful word is %s - %d", winner,max);

    }
}
