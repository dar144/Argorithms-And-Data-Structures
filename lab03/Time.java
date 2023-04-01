import java.util.Objects;

class Time {
    // KONSTRUKTORY 
    Time(int days, int h, int m, int s) {
        d = days;
        this.h = h;
        this.m = m;
        this.s = s;
    }

    Time() {
        this(0, 0, 0, 0);
    }


    // METODA KOPIUJĄCA 
    public static Time copyOf(Time obj) {
        Time copyTime = new Time(obj.d, obj.h, obj.m, obj.s);
        return copyTime;
    }


    // METODA DZIAŁAJĄCA JAKO KONSTRUKTOR (STRING -> INT)
    public static Time timeOf(String str) {
        String[] splitted = str.split(":");
        Time result = new Time(Integer.valueOf(splitted[0]), Integer.valueOf(splitted[1]),
            Integer.valueOf(splitted[2]), Integer.valueOf(splitted[3]));
        return result;
    }


    // SETTERY
    public void setDays(int days) {
        if(days < 0)
            System.out.println("Błędna liczba dni do ustawienia: " + days);  
        else
            this.d = days;
    }

    public void setHours(int hours) {
        if(hours < 0 || hours >= HOURS_PER_DAY)
            System.out.println("Błędna liczba dni do ustawienia: " + hours);  
        else
            this.h = hours;
    }

    public void setMinutes(int minutes) {
        if(minutes < 0 || minutes >= MINUTES_PER_HOUR)
            System.out.println("Błędna liczba dni do ustawienia: " + minutes);  
        else
        this.m = minutes;
    }

    public void setSeconds(int seconds) {
        if(seconds < 0 || seconds >= SECONDS_PER_MINUTE)
            System.out.println("Błędna liczba dni do ustawienia: " + seconds);  
        else
        this.s = seconds;
    }


    // GETTERY
    public int getDays() { return d; }

    public int getHours() { return h; }

    public int getMinutes() { return m; }

    public int getSeconds() { return s; }


    // METODY ADD
    public void addDays(int days) {
        this.setDays(d + days);
    }

    public void addHours(int hours) {
        int tmpHours = this.h + hours;
        if(tmpHours >= HOURS_PER_DAY) {
            int toAdd = tmpHours / HOURS_PER_DAY;
            this.addDays(toAdd);
            tmpHours %= HOURS_PER_DAY;
        }
        this.setHours(tmpHours);
    }

    public void addMinutes(int minutes) {
        int tmpMinutes = this.m + minutes;
        if(tmpMinutes >= MINUTES_PER_HOUR) {
            int toAdd = tmpMinutes / MINUTES_PER_HOUR;
            this.addHours(toAdd);
            tmpMinutes %= MINUTES_PER_HOUR;
        }
        this.setMinutes(tmpMinutes);
    }

    public void addSeconds(int seconds) {
        int tmpSeconds = this.s + seconds;
        if(tmpSeconds >= SECONDS_PER_MINUTE) {
            int toAdd = tmpSeconds / SECONDS_PER_MINUTE;
            this.addMinutes(toAdd);
            tmpSeconds %= SECONDS_PER_MINUTE;
        }
        this.setSeconds(tmpSeconds);        
    }


    // METODY DODAWANIA ORAZ POMNOŻENIA
    public static Time plusTime(Time t1, Time t2) {
        Time tmp = Time.copyOf(t1);
        tmp.addSeconds(t2.s);
        tmp.addMinutes(t2.m);
        tmp.addHours(t2.h);
        tmp.addDays(t2.d);
        return tmp;
    }

    public static Time times(Time t1, int addValue) {
        Time tmp = new Time();
        tmp.addSeconds(t1.s*addValue);
        tmp.addMinutes(t1.m*addValue);
        tmp.addHours(t1.h*addValue);
        tmp.addDays(t1.d*addValue);
        return tmp;
    }
    

    // METODY OVERRIDE 
    @Override
    public String toString() {
        String str = d + ":";
        if(h < 10) str += "0" + h + ":"; 
            else str += h + ":";
        if(m < 10) str += "0" + m + ":"; 
            else str += m + ":";
        if(s < 10) str += "0" + s; 
            else str += "" + s;
        return str;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null) return false;
        if(this.getClass()!=o.getClass()) return false;
        Time oTime = (Time) o;
        return this.d == oTime.d && this.h == oTime.h && this.m == oTime.m && this.s == oTime.s; 
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.d, this.h, this.m, this.s);
    }


    private int d;
    private int h;
    private int m;
    private int s;

    static final int SECONDS_PER_MINUTE = 60;
    static final int MINUTES_PER_HOUR = 60;
    static final int HOURS_PER_DAY = 24;
    static final Time ZERO = new Time();
    public static final Time ONE_SECOND = new Time(0,0,0,1);
    static final Time ONE_MINUTE = new Time(0,0,1,0);
    static final Time ONE_HOUR = new Time(0,1,0,0);
    static final Time ONE_DAY = new Time(1,0,0,0);
    static final Time ONE_YEAR = new Time(365,0,0,0);
}
