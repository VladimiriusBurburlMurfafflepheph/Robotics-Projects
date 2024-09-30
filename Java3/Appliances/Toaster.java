package Appliances;

public class Toaster {
    String name;
    private int slices;
    private int darknessSetting;
    boolean isBagel = false;
    static int totalSlicesToasted = 0;
    public int getDarkness(){
        return darknessSetting;
    }
    public Toaster(String name){
        this.name = name;
        this.darknessSetting = 5;
        this.slices = 2;

    }
    public void setSlices(int newSetting){
        if (newSetting < 1) {
            newSetting = 1;
        }
        if (newSetting > 4) {
            newSetting = 4;
        }
        slices = newSetting;
    }
    
    public void setDarkness(int newSetting){
        if (newSetting < 1) {
            newSetting = 1;
        }
        if (newSetting > 10){
            newSetting = 10;
        }
        darknessSetting = newSetting;
    }
    public void toast(){
        totalSlicesToasted += slices;
        System.out.println("--------------------------------------------------");
        System.out.println(name + " is working...");
    //count to darkness setting before announcing toast.
        int n = 1;    
        while (n <= darknessSetting) {
            System.out.println(n + "...");
            n++;
        }
        if (isBagel) {
            System.out.println("You have " + slices + " slices of freshly toasted bagel!");
            System.out.println();
        }
        else{
            System.out.println("You have " + slices + " slices of freshly toasted toast!");
            System.out.println("--------------------------------------------------");
            System.out.println();
        }
        System.out.println("Total slices: " + totalSlicesToasted);
        
    }  
}
