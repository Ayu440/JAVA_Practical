class MathUtils{
    static int square(int num){
        return num*num;
    }
}
public class UserDefined_static{
    public static void main(String[] args){

        int result = MathUtils.square(5);
        System.out.println("square of 5 = "+result);
    }
}