import java.util.Scanner;
public class intGetter {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int n = getInt("What is the answer?", 100);
        System.out.println("The answer is " + n + ".");
        if (n == 42) {
            System.out.println("Welcome, fan of Mr. Adams.");
        }
        scanner.close();
    }
    static int getInt(String question, int min){
        //use the scanner to get an integer that is at least as big as 'min'
        question = question + "Min: " + min + ")";
        int n = min - 1;
        while (true){
             n = getInt(question);
        if (n >= min) {
            return n;
        }
        else{
            System.out.println("Too smol.");
        }
    }
    }
    static int getInt(String question){
        
        while (true){
        
            System.out.print(question + " ");
        
        if (scanner.hasNextInt()){
            int n = scanner.nextInt();
            // scanner.close();
            return n;
        
        }
        else{
            System.out.println("That's not a number, you complete and utter bithering and blathering buffoon!");
            scanner.next();
        }
    }
    }
}
