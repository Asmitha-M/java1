package J1;

class OverloadDemo {
  void test () {
   System.out.println("No parameters"); 
 }

void test(int a) {
 System.out.println("a: " + a);
}

void test (int a, int b) {
 System.out.println("a and b: "+a+" " + b); 
}
}

class B1 {
 public static void main(String args[]) {
  OverloadDemo ob = new OverloadDemo();
  ob.test();
  ob.test(10);
  ob.test(10,20);
}
}

