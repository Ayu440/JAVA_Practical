class Student{
    String name;
    int age;
    //non static method
    void displayDetails()
{
    System.out.println("name : "+name + " , age: "+age);      

}    
}


public class non_static {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Vineet";
        s1.age = 25;

        s1.displayDetails();
    }
    
}