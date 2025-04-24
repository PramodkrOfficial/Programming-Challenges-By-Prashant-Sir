package in.kgcoding.challenge97;

public enum Day {
    Monday(true), Tuesday(true), Wednesday(true), Thrusday(true), Friday(true), Saturday(false), Sunday(false);

    private final boolean isWeekDay;

    Day(boolean isWeekDay) {
        this.isWeekDay = isWeekDay;
    }

    public String getType() {
        return isWeekDay ? "Weekday" : "Weekend";
    }
}
