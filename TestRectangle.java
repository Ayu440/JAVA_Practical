class Rectangle {
    //Instance method with parameters 
    int area(int length, int breadth){
        return length * breadth;
    }
    
}

public class TestRectangle{
    public static void main(String []args){
        Rectangle rl = new Rectangle();
        int area = rl.area(5, 10);
        System.out.println("Area of rectangle: " + area);
    }
}
