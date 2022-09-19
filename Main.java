
package MyTime;

public class Main {
    public static void main(String[] args) {
        MyTime t = new MyTime();
        System.out.println("non-args = "+t);
        System.out.println(t.getHour());
        System.out.println(t.getMinute());
        System.out.println(t.getSecound());
        System.out.println(t.nextHour());
        System.out.println(t.nextMinute());
        System.out.println(t.nextSecond());
        System.out.println(t.previousHour());
        System.out.println(t.previousMinute());
        System.out.println(t.previousSecond());
        MyTime m = new MyTime(16, 3, 86);
        System.out.println(m.nextSecond());
        System.out.println(m.getSecound());
    }
}
