public class Bus extends Model implements BoardingPassenger,StartDrive,oilCheck{

    int nowPassenger;
    private int oilcheck;
    private int oilCheck;


    public Bus(int num, int oil, int speed, int speedChange) {
        super(1,100,100,30,1000,"운행");
        this.maxPassenger = maxPassenger;
        this.state = state;
    }
    @Override
    public void boarding(int nowPassenger) {
        System.out.println("탑승 승객수=" + nowPassenger);
        this.nowPassenger=nowPassenger;
        System.out.println("잔여 승객수=" + (30-nowPassenger));
        System.out.println("요금확인=" + (nowPassenger * 1000));


    }


    @Override
    public void startdrive(String state) {
        this.state = state;
        System.out.println("버스상태=" + state);
    }

    @Override
    public void oil(int oilCheck) {
        this.oilCheck = oilCheck;
        if (oilCheck > 10){
            System.out.println("주유상태=" + oilCheck +",운행가능합니다");
        } else if (1<oilCheck && oilCheck < 10) {
            System.out.println("주유상태=" + oilCheck +",주유가 필요합니다.");
        } else if (oilCheck == 0) {
            System.out.println("주유상태=" + oilCheck +",차고지행");
        }

    }
    }




