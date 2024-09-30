class TrianglePrinter {
    public static void main(String args[]){
        
        int asteriskCountY = 0;
        while (asteriskCountY < 8) {
        
            int asteriskCountX = 0;
            
            while (asteriskCountX <= asteriskCountY) {
                
                System.out.print("* ");
                asteriskCountX ++;
           
            }
            asteriskCountY ++;
            System.out.println();
        }
    }
}