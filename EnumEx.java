public class EnumEx {
    enum Week{
        Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday;

        Week(){
            System.out.println("Constructor called for "+ this);
        }
    }

    public static void main(String[] args) {
        System.out.println("Main");
        Week week = Week.Saturday;
        System.out.println(week);

        for (Week day: Week.values()) {
            System.out.println(day);
        }
        System.out.println(week.ordinal());
    }
}
