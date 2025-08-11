public class AddUsingBitwiseNot {
    public static int addOne(int num) {
        return -(~num);
    }
    public static void main(String[] args) {
        int num = 4;
        System.out.println(addOne(num));
    }
}