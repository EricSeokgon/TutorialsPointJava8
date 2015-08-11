package NewDateTimeAPI;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.time.DayOfWeek;

/**
 * Project: TutorialsPointJava8
 * FileName: TemporalAdjusters
 * Date: 2015-08-11
 * Time: 오전 9:23
 * Author: sklee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class TemporalAdjuster {
    public static void main(String args[]){
        TemporalAdjuster java8tester = new TemporalAdjuster();
        java8tester.testAdjusters();
    }

    public void testAdjusters(){

        //Get the current date
        LocalDate date1 = LocalDate.now();
        System.out.println("Current date: " + date1);

        //get the next tuesday
        LocalDate nextTuesday = date1.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println("Next Tuesday on : " + nextTuesday);

        //get the second saturday of next month
        LocalDate firstInYear = LocalDate.of(date1.getYear(),date1.getMonth(), 1);
        LocalDate secondSaturday = firstInYear.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY)).with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println("Second Saturday on : " + secondSaturday);
    }
}
