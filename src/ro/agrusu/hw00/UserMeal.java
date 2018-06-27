package ro.agrusu.hw00;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class UserMeal {
    private final LocalDateTime dateTime;

    private final String description;

    private final int calories;

    public UserMeal(LocalDateTime dateTime, String description, int calories) {
        this.dateTime = dateTime;
        this.description = description;
        this.calories = calories;
    }

    public LocalDateTime getDateTime() {
        System.out.println("getDateTime(): " + dateTime);
        return dateTime;
    }

    public String getDescription() {
        return description;
    }

    public int getCalories() {
        System.out.println("getCalories(): " + calories);
        return calories;
    }

    public LocalDate getDate() {
        System.out.println("getDate(): " + getDateTime().toLocalDate());
        return getDateTime().toLocalDate();
    }

    public LocalTime getTime() {
        return getDateTime().toLocalTime();
    }

    @Override
    public String toString() {
        return "UserMeal{" +
                "dateTime=" + dateTime +
                ", description='" + description + '\'' +
                ", calories=" + calories +
                '}';
    }
}
