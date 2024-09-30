class NestedLoop {
    public static void main(String args[]){
        int y = 0;
        while (y < 5) {
            
            int x = 0;
            while (x < 10) {
                System.out.print(x + "," + y + "  ");
                x ++;
            }
        System.out.println();
        y ++;
        }
    }
}
