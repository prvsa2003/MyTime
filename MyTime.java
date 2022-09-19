package MyTime;

public class MyTime {

    private int hour = 0;
    private int minute = 0;
    private int secound = 0;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int secound) {
        this.hour = hour;
        this.minute = minute;
        this.secound = secound;
    }

    public void setTime(int hour, int minute, int secound) {
        setHour(hour);
        setMinute(minute);
        setSecound(secound);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("Not valid hour's value");
        }
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Not valid minute's value");
        }
        this.minute = minute;
    }

    public int getSecound() {
        return secound;
    }

    public void setSecound(int second) {
        if (second < 0 || second > 59) {
            throw new IllegalArgumentException("Not valid second's value");
        }
        this.secound = second;
    }
     public MyTime nextSecond()
    {
        try {
            setTime(hour, minute, ++secound);
            return this;
        }
        catch(IllegalArgumentException e) {}

        secound = 0;
        return nextMinute();
    }
public MyTime nextMinute()
    {
        try {
            setTime(hour, ++minute, secound);
            return this;
        }
        catch(IllegalArgumentException e) {}

        minute = 0;
        return nextHour();
    }
public MyTime nextHour()
    {
        try {
            setTime(++hour, minute, secound);
            return this;
        }
        catch(IllegalArgumentException e) {}

        hour = 0;
        return this;          
    }
    public MyTime previousSecond()
    {
        try {
            setTime(hour, minute, --secound);
            return this;
        }
        catch(IllegalArgumentException e) {}

        secound = 59;
        return previousMinute();
    }
    public MyTime previousMinute() {
        try {
            setTime(hour, --minute, secound);
            return this;
        }
        catch(IllegalArgumentException e) {}

        minute = 59;
        return previousHour();
    }

    
    public MyTime previousHour() {
        try {
            setTime(--hour, minute, secound);
            return this;
        }
        catch(IllegalArgumentException e) {}

        hour = 23;
        return this;
    }

   
    public String toString() {
        return String.format("%1$02d:%2$02d:%3$02d", hour, minute, secound);
    }



}
