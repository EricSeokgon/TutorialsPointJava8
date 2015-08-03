package DefaultMethods;

/**
 * Project: TutorialsPointJava8
 * FileName: asdad
 * Date: 2015-08-03
 * Time: ¿ÀÀü 10:42
 * Author: sklee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Java8Tester {
    public static void main(String args[]){
        Vehicle vehicle = new Car();
        vehicle.print();
    }
}

interface Vehicle {
    default void print(){
        System.out.println("I am a vehicle!");
    }

    static void blowHorn(){
        System.out.println("Blowing horn!!!");
    }
}

interface FourWheeler {
    default void print(){
        System.out.println("I am a four wheeler!");
    }
}

class Car implements Vehicle, FourWheeler {
    public void print(){
        Vehicle.super.print();
        FourWheeler.super.print();
        Vehicle.blowHorn();
        System.out.println("I am a car!");
    }
}
