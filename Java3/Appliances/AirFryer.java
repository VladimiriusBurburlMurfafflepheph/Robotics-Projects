package Appliances;

public class AirFryer extends Toaster {
    
    public AirFryer(String name){
        super(name);

    }
    public void fry(){
        
        System.out.println("YUM-- speedytoasted! Just like Starbucks.");
    }
        @Override public void toast(){
            super.toast();
            System.out.println("Are you sure you wanted toast? fry is better.");
        }

}
