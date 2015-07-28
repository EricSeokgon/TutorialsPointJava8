package LambdaExpressions;

/**
 * Project: TutorialsPointJava8
 * FileName: sdfsdf
 * Date: 2015-07-29
 * Time: ¿ÀÀü 12:27
 * Author: hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Java8Scope {

    final static String salutation = "Hello! ";

    public static void main(String args[]){
        GreetingService greetService1 = message ->
                System.out.println(salutation + message);
        greetService1.sayMessage("Mahesh");
    }

    interface GreetingService {
        void sayMessage(String message);
    }
}
