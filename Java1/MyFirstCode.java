import java.util.Scanner;
class helloworld{
    public static void main(String args[]){
        System.out.println("Hello World.");
        System.out.println("ACHOOO!!!! Good lord, that was a tremendous sneeze. If I could say 'bless me,' I would, but people say that's pretentious, so I digress...");
        int markerCount = 2;
        System.out.println(markerCount);
        markerCount = markerCount + 87;
        System.out.println(markerCount);
        // Now we will create a Scanner object to take user input from the terminal
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many markers did you buy? ");

       
        if (scanner.hasNextInt()){
            int newMarkers = scanner.nextInt();
            if (newMarkers < 0) {
            System.out.println("DO NOT WASTE MARKERS!");
            }
            else{ // "In all other cases"
            markerCount = markerCount + newMarkers;
            System.out.println("You have " + markerCount + " markers.");

            }
        }
        else{
        scanner.next();
        System.out.println("That's not a number. Goodbye.");
       }
        scanner.close();    
    }
}

