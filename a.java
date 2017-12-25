import java.util.Scanner;//下载IJ后第一个程序
public class a {
    public static void main(String[] args){
        System.out.println("Hello World!");
        Scanner scan = new Scanner(System.in);
        String A=scan.next();
        Student Tom = new Student(A);
        System.out.println(Tom.Name);
    }
}
class Student{
    String Name;
    public Student(String Student){
        this.Name=Student;
    }

}