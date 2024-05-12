package homework4;

import java.util.Calendar;
import java.util.GregorianCalendar;

public enum Holiday {
    NEW_YEAR(new GregorianCalendar(2024, Calendar.DECEMBER, 31)),
    MARCH_8(new GregorianCalendar(2024, Calendar.MARCH, 8)),
    FEBRUARY_23(new GregorianCalendar(2024, Calendar.FEBRUARY, 23));

    private final Calendar holidayDate;

    Holiday(Calendar holidayDate) {
        this.holidayDate = holidayDate;
    }

    public Calendar getHolidayDate() {
        return holidayDate;
    }
}
