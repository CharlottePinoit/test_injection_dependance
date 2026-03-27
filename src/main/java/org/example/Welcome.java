package org.example;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Welcome {
    private final TimeProvider timeProvider;

    public Welcome(TimeProvider timeProvider) {
        this.timeProvider = timeProvider ;
    }
    public String getMessage() {
        LocalDateTime now = timeProvider.now();
        DayOfWeek day = now.getDayOfWeek();
        int hour = now.getHour();

        // Cas spécial pour le week-end (vendredi 18h et lundi 9h)
        if ((day == DayOfWeek.FRIDAY && hour >= 18) ||
                (day == DayOfWeek.SATURDAY) ||
                (day == DayOfWeek.SUNDAY) ||
                (day == DayOfWeek.MONDAY && hour < 9)) {
            return "Bon week-end";
        }

        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                if (hour >= 9 && hour < 13) {
                    return "Bonjour";
                } else if (hour >= 13 && hour < 18) {
                    return "Bon après-midi";
                } else {
                    return "Bonsoir";
                }
            default:
                return "Bonsoir";
        }
    }
}
