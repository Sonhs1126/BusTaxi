public  class Taxi extends Model implements StartDrive,Distance,BoardingPassenger {
    private int nowPassenger;
    private int distancePrice;

    public Taxi(int num, int oil, int speed, int speedChange) {
        super(1, 100, 100, 4, 3000, "일반");
        this.maxPassenger = maxPassenger;
        this.state = state;
    }



    @Override
    public void distance(int distancePrice) {
        this.distancePrice = distancePrice;
        System.out.println("목적지까지의 거리는=" + distancePrice + "입니다" );
        if (distancePrice > 1){
            System.out.println("목적지까지의 추가요금이" + (distancePrice*4000)+"원이 추가됩니다.");

        }


        }

    @Override
    public void boarding(int nowPassenger) {
        System.out.println("탑승 승객수=" + nowPassenger);
        this.nowPassenger=nowPassenger;
        System.out.println("잔여 승객수=" + (4-nowPassenger));

        }

    @Override
    public void startdrive(String state) {
        this.state = state;
        System.out.println("택시상태=" + state);
    }
}




