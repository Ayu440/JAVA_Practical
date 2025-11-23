class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

class Marks extends Student {
    int m1, m2, m3, m4;

    Marks(String name, int rollNo, int m1, int m2, int m3, int m4) {
        super(name, rollNo);
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
    }

    void displayResults() {
        displayInfo();
        int total = m1 + m2 + m3 + m4;
        double percentage = total / 3.0;

        System.out.println("Marks: " + m1 + ", " + m2 + ", " + m3 +", " +m4) ;
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage + "%");
    }
}

public class single_inheritance {
    public static void main(String[] args) {
        Marks s1 = new Marks("Ayush", 101, 85, 90, 88, 80);
        s1.displayResults();
    }
}
