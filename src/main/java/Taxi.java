public class Taxi {
    int taxiNumber;
    int gas;
    int speed;
    static final int basicDistance = 2;
    static final int basicCharge = 2800;
    static final int chargeForDistance= 100;
    int totalCharge;
    String state;


    public Taxi() {
        this.taxiNumber = taxiNumber;
        this.state = "일반";
    }


    boolean check() {
        return gas>=10;
    }


    public void drive() {
        if (check()) {
            System.out.println("운행 시작");
            this.state = "일반";
        } else {
            System.out.println("운행 불가");
            this.state = "탑승 불가";
        }
    }


    public void rideOn(String destination) {
        if (this.state.equals("일반")){
            this.state = "운행 중";
            System.out.println("목적지 "+ destination +"으로 이동합니다.");
        } else {
            this.state = "탑승 불가";
            System.out.println("탑승 불가");
        }
    }


    public void changeSpeed(int changeSpeed) {
        this.speed = changeSpeed;
    }


    public void chargeAdd(int distanceToDestination) {
        if(distanceToDestination>basicDistance){
            this.totalCharge= basicCharge + (distanceToDestination-basicDistance)*chargeForDistance;
        } else {
            this.totalCharge = basicCharge;
        }
    }


    public void pay() {
        this.totalCharge = totalCharge;
        System.out.println("총 요금은 "+ totalCharge +"원입니다.");
    }

    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        taxi.check();
        taxi.drive();
        taxi.rideOn("반월당");
        taxi.changeSpeed(50);
        taxi.chargeAdd(30);
        taxi.pay();
    }
}