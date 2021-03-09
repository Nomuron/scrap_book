import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numDesks1 = scanner.nextInt();
        int numDesks2 = scanner.nextInt();
        int numDesks3 = scanner.nextInt();
        
        System.out.println(numDesks1 % 2 + numDesks1 / 2 + 
                            numDesks2 % 2 + numDesks2 / 2 +
                            numDesks3 % 2 + numDesks3 / 2);
    }
}
