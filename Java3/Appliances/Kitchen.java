package Appliances;
 
class Kitchen {
    
    public static void main(String [] args){
        Toaster t = new Toaster("Chromester");
        Toaster t2 = new Toaster("PlastiToast");
        t2.isBagel = true;
        t2.setSlices(42);
        t.setSlices(-498);
        t2.setDarkness(34);
        System.out.println(t2.name + " has a darkness setting of " + t2.getDarkness() + ".");
        t.setDarkness(-17);
        t2.toast();
        System.out.println(t.name + " has a darkness setting of " + t.getDarkness() + ".");
        t.toast();
        System.out.println("Now we have an AIR FRYER!!!");
        AirFryer fryer = new AirFryer("Clark Kent");
        fryer.isBagel = true;
        fryer.toast();
        fryer.fry();
    }
}
