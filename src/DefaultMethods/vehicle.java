package DefaultMethods;

/**
 * Project: TutorialsPointJava8
 * FileName: sdfsdf
 * Date: 2015-08-01
 * Time: 오전 7:56
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public interface vehicle {
    default void print(){
        System.out.println("I am a vehicle!");
    }
}
