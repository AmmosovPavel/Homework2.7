public class TravelTime {
    public static void main(String[] args) {
        final int DISTANCE_TO_JOB = 20;
        final double TAXI_SPEED = 46.7;// - средняя, км.ч
        final double TRAVEL_TIME = DISTANCE_TO_JOB / TAXI_SPEED;
        final double DECELERATION_FACTOR = 1.4;
        final double EVENING_TRAVEL_TIME = TRAVEL_TIME * DECELERATION_FACTOR;

        System.out.println("Расстояние от дома до офиса тестировщика " + DISTANCE_TO_JOB + " километров");
        System.out.println("Средняя скорость такси " + TAXI_SPEED + " км/ч");
        System.out.println("Тестировщик добирается из дома до ифиса за " + TRAVEL_TIME + " часа");
        System.out.println("Коэффициент замедления транспорта вечером составляет " +DECELERATION_FACTOR);
        System.out.println("Тестировщик вечером добирается с работы домой ха " + EVENING_TRAVEL_TIME + " часа");

    }
}
