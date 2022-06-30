import java.util.UUID;

public class Bus {
    String busNum;          // 버스번호
    int passenger;       // 현재 승객 수
    int charge;      // 버스 요금
    int gas = 12;                // 주유량
    int speed = 50;              // 현재 속도
    String state = "운행";  // 상태 (운행 or 차고지 행)


    public void start() {   // 버스 운행 버스 고유 번호 부여
        System.out.println("\n[버스 주행 전 Checek]" );
        System.out.println(busNum = UUID.randomUUID().toString() + " : 버스 고유 번호 부여 완료");
        System.out.println("운행 시작\n");
    }


    public void busState() {                                    // 버스 상태 변경 메소드
        if (gas < 10 || !state.equals("운행")) {                // 기름이 10 미만이거나, 상태가 "운행" 과 동일한 문자열이 아닌 경우
            System.out.println("주유량을 확인해주세요!");         // 주유가 필요하다는 메세지를 우선 출력 후,
            state = "차고지 행";                                // 상태를 "차고지 행"으로 변경

        }
    }


    public void rideOn(int passenger) {                         // 승객 탑승 메소드
        this.passenger += passenger;                            // passenger로 입력되는 인자 값을 int passenger 매개변수를 통해 this.passenger에 적재
        if(this.passenger <= 30 && state.equals("운행")){        // this.passenger 가 30 이하이고, 상태가 "운행인 경우" (AND 개념)
            System.out.println("현재 승객의 수는 " + this.passenger + "명입니다."); // this.passenger를 통해 현재 탑승중인 승객 전체 인원 수를 표시
        } else {
            System.out.println("최대 승객 수를 초과하였습니다.");                    // AND 조건에 맞지 않으면 최대 승객 수를 초과했다는 메세지 출력
        }
    }


    public void changeSpeed(int changeSpeed) {
        this.speed = changeSpeed;
        }


    public static void main(String[] args) {
        Bus check = new Bus();
        check.start();

        Bus bus = new Bus();
        bus.busState();
        bus.rideOn(31); // 탑승객 수
        bus.changeSpeed(70);  //바꿀 속도


    }
}