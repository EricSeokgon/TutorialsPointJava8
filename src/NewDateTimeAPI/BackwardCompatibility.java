package NewDateTimeAPI;

/**
 * Project: TutorialsPointJava8
 * FileName: BackwardCompatibility
 * Date: 2015-08-12
 * Time: 오전 9:54
 * Author: sklee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

import java.util.Date;

import java.time.Instant;
import java.time.ZoneId;

public class BackwardCompatibility {
    public static void main(String args[]){
        BackwardCompatibility java8tester = new BackwardCompatibility();
        java8tester.testBackwardCompatability();
    }

    public void testBackwardCompatability(){

        //Get the current date
        Date currentDate = new Date();
        System.out.println("Current date: " + currentDate);

        //Get the instant of current date in terms of milliseconds
        Instant now = currentDate.toInstant();
        ZoneId currentZone = ZoneId.systemDefault();

        LocalDateTime localDateTime = LocalDateTime.ofInstant(now, currentZone);
        System.out.println("Local date: " + localDateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(now, currentZone);
        System.out.println("Zoned date: " + zonedDateTime);
    }
}
