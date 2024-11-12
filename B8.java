
package J1;

class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

interface Flyable {
    void fly();
}


interface Swimmable {
    void swim();
}

class Duck extends Animal implements Flyable, Swimmable {
  
    @Override
    public void fly() {
        System.out.println("Duck is flying.");
    }
    
    
    @Override
    public void swim() {
        System.out.println("Duck is swimming.");
    }
}

public class B8 {
    public static void main(String[] args) {
        Duck myDuck = new Duck();
        
        myDuck.eat();    
        myDuck.fly();      
        myDuck.swim();     
    }
}