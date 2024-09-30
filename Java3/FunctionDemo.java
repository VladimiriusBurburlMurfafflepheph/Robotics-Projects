public class FunctionDemo {
    public static void main(String args[]){

        greet();
        kaboom();

        }
       
        static void greet(){
            System.out.println("Hello World.");
        }

        static void kaboom(){
            int countDown = 10;
            while (countDown > 0) {
                System.out.println(countDown);
                countDown -= 1;
            }
            if (countDown == 0) {
                System.out.println("Kaboom!");
            }
        }
}
