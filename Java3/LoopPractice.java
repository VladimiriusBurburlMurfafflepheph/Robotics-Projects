import java.util.Scanner;

class LoopPractice{
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to loop Practice.");
        System.out.println("How far would you like to count?");
        int countTo = 1000;
        if (scanner.hasNextInt()) {
            countTo = scanner.nextInt();
            
        }
        int counter = 50;
        while(counter > 40){
            System.out.println(counter);
            counter = counter + 1000;
            

        }
        scanner.close();
    }
    
}