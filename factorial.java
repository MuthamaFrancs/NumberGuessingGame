public class factorial {
    
    public static void main(String[] args) {
        int num = 5; // The number you want to calculate the factorial of
        long factorial = 1;
    
        for(int i = 1; i <= num; ++i) {
            factorial *= i;
        }
    
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
     
     
}
