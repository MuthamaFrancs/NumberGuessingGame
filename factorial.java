public class factorial {
    
// Number pattern
    public static void main(String[] args) {
        int rows = 5; // You can change this to control the number of rows

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("0");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
     
}
