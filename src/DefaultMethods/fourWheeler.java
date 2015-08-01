package DefaultMethods;

/**
 * Project: TutorialsPointJava8
 * FileName: sdf
 * Date: 2015-08-02
 * Time: 오전 1:03
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public interface fourWheeler {
    default void print(){
        System.out.println("I am a four wheeler!");
    }
}
