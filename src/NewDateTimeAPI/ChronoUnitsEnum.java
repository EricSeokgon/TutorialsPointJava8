package NewDateTimeAPI;

/**
 * Project: TutorialsPointJava8
 * FileName: ChronoUnitsEnum
 * Date: 2015-08-09
 * Time: 오전 12:07
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ChronoUnitsEnum {
    public static void main(String args[]) {
        ChronoUnitsEnum chronoUnitsEnum = new ChronoUnitsEnum();
        chronoUnitsEnum.testChromoUnits();
    }

    public void testChromoUnits() {

        //Get the current date
        LocalDate today = LocalDate.now();
        System.out.println("Current date: " + today);

        //add 1 week to the current date
        LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
        System.out.println("Next week: " + nextWeek);

        //add 1 month to the current date
        LocalDate nextMonth = today.plus(1, ChronoUnit.MONTHS);
        System.out.println("Next month: " + nextMonth);

        //add 1 year to the current date
        LocalDate nextYear = today.plus(1, ChronoUnit.YEARS);
        System.out.println("Next year: " + nextYear);

        //add 10 years to the current date
        LocalDate nextDecade = today.plus(1, ChronoUnit.DECADES);
        System.out.println("Date after ten year: " + nextDecade);
    }
}