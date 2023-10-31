public class TravelTime {
    public static void main(String[] args) {
        final int distanceToJob = 20;
        final double taxiSpeed = 46.7;// - средняя, км.ч
        final double travelTime = distanceToJob / taxiSpeed;
        final double decelerationFactor = 1.4;
        final double eveningTravelTime = travelTime * decelerationFactor;

        System.out.println("Расстояние от дома до офиса тестировщика " + distanceToJob + " километров");
        System.out.println("Средняя скорость такси " + taxiSpeed + " км/ч");
        System.out.println("Тестировщик добирается из дома до ифиса за " + travelTime + " часа");
        System.out.println("Коэффициент замедления транспорта вечером составляет " + decelerationFactor);
        System.out.println("Тестировщик вечером добирается с работы домой ха " + eveningTravelTime + " часа");
    }
}
