public class Main {

    public static void main(String[] args) {

        Hour firstObjHour = new Hour(11, 22, 66 );
        Hour secondObjHour = new Hour(10, 15 , 12);

        Hour resultHour = new Hour ();

        firstObjHour.sumHours(firstObjHour, secondObjHour);

        resultHour = firstObjHour;

        resultHour.getTime();
    }
}
