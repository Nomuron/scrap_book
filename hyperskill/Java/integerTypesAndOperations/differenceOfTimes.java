import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int hourOne = scanner.nextInt();
        int minuteOne = scanner.nextInt();
        int secondOne = scanner.nextInt();
        int hourTwo = scanner.nextInt();
        int minuteTwo = scanner.nextInt();
        int secondTwo = scanner.nextInt();
        
        System.out.println(hourTwo * 3600 + minuteTwo * 60 + secondTwo 
            - (hourOne * 3600 + minuteOne * 60 + secondOne));
    }
}
