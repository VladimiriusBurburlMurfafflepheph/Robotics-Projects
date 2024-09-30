class DiamondPrinterFunction {
    
        
         static void topHalf(){
        int topRowNumber = 3;
        for(int rowCount = 0; rowCount <= 3; rowCount ++){
        drawSpaces(topRowNumber - rowCount);
        drawStars(2 * rowCount + 1);
        System.out.println();
        }
        }
        static void bottomHalf(){
       
               int bottomRowNumber = 3;
               for(int rowCount = 2; rowCount >= 0; rowCount --){
                drawSpaces(bottomRowNumber - rowCount);
                drawStars(2 * rowCount + 1);
                System.out.println();  
               }
            
        }
        
            static void drawSpaces(int count){
            
                for(int spaces = 0; spaces < count; spaces++){
                    System.out.print(" ");
                }
            }
            static void drawStars(int count){
                for(int stars = 0; stars < count; stars++){
                    System.out.print("*");
                }
                }
    public static void main(String args[]){
        topHalf();
        bottomHalf();
        
       
          
      
        

        
        
       

       
        }
    }
