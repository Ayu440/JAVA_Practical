public class AssignmentTest {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        
        x += y;
        System.out.println("x += y: " + x);
        
        x = 10;
        x -= y;
        System.out.println("x -= y: " + x);
        
        x = 10;
        x *= y;
        System.out.println("x *= y: " + x);
        
        x = 10;
        x /= y;
        System.out.println("x /= y: " + x);
    }
}
