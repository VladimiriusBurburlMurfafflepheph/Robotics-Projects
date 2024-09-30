package myFirstClass;

public class Colony {
    String name;
    private int packageCount;
    private int crewSize;
    boolean isSabretooth = false;
    boolean isAenocyon = false;
    boolean isInvictus = false;

    public Colony(String name){
        this.name = name;
        this.crewSize = 2;
        this.isSabretooth = true;
    }

    public void setpackageCount(int newSetting){
        if (newSetting < 1) {
            newSetting = 1;
        }
        if (newSetting > 3) {
            newSetting = 3;
        }
    }


    public void setcrewSize(int newSetting){
        if (newSetting < 2) {
            newSetting = 2;
        }
        if (newSetting > 5000) {
            newSetting = 5000;
        }
    }
    public void colony(){
        System.out.println("");
        System.out.println(name + " is under construction.");
        

    }
}