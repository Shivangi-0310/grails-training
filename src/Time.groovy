class Time {
    int hour
    int minute

    Time plus(Time time) {
        new Time(hour: this.hour + time.hour, minute: this.minute + time.minute);
    }

    Time minus(Time time) {
        new Time(hour: this.hour - time.hour, minute: this.minute - time.minute);
    }

    public String toString() {
        return "$hour : $minute";
    }

    static void main(String[] args) {
        Time time1 = new Time([hour: 4, minute: 50]);
        Time time2 = new Time([hour: 2, minute: 20]);


        Time timeFetched = time1 + time2
        println "Time added :: $timeFetched"

        timeFetched = time1 - time2
        println "Time diffrence :: $timeFetched"

    }
}
