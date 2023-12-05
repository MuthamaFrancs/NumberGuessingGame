public class test {
    public static void main(String[] args) {
        int min = 1;
        int max = 10;
        int range = max - min + 1;
        int rand = (int)(Math.random() * range) + min;
        System.out.println(rand);
    }
}
