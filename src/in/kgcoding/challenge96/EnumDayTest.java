package in.kgcoding.challenge96;

public class EnumDayTest {
    public static void main(String[] args) {
        System.out.println("Printing all the days of the week: ");
        System.out.println(Day.Monday);
        System.out.println(Day.Tuesday);
        System.out.println(Day.Wednesday);
        System.out.println(Day.Thrusday);
        System.out.println(Day.Friday);
        System.out.println(Day.Saturday);
        System.out.println(Day.Sunday);
        System.out.println();

        System.out.println("Professional way");

        for (Day value : Day.values()) {
            System.out.println(value);
        }
    }
}
