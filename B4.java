package J1;

public class B4 {
    class InnerClass{
        void display(){
            System.out.println("hello from innerclass");
        }
    }
    public static void main(String[] args){
        B4 outer=new B4();
        B4.InnerClass inner=outer.new InnerClass();
        inner.display();
   }
}