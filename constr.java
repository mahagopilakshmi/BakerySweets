import java.io.*;
class Student{
    int a ,b;
    Student(){
       a = 10;
       b = 20;
    }
    Student(int a, int b){
        this.a = a;
        this.b = b;
    }
    Student(Student s){
        a = s.a;
        b = s.b;
    }
    void output(){
        System.out.println(a+"\t"+b);
    }
}
class Test{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println("Enter x and y");
        int x = Integer.valueOf(br.readLine());
        int y = Integer.valueOf(br.readLine());
        Student s3 = new Student(x,y);
        System.out.println("Enter x and y");
        int x = Integer.valueOf(br.readLine());
        int y = Integer.valueOf(br.readLine());
        Student s4 = new Student(x,y);
        Student s5 = new Student(s4);
        s1.output();
        s2.output();
        s3.output();
        s4.output();
        s5.output();

    }
}