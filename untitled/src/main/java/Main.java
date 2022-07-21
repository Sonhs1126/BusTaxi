public class Main {
    public static void main(String[] args) {
        Model bus = new Bus(1,100,0,100);
        Model taxi = new Taxi(1,100,100,200);

        if (bus instanceof  StartDrive){
            ((StartDrive) bus).startdrive("운행중");

        }

        if (bus instanceof oilCheck){
            ((oilCheck) bus).oil(0);

        }

        if (bus instanceof BoardingPassenger){
            ((BoardingPassenger) bus).boarding(4);
            System.out.println("------------------");
        }
        if (taxi instanceof StartDrive){
            ((StartDrive) taxi).startdrive("일반");
        }

        if(taxi instanceof Distance){
            ((Distance) taxi).distance(2);
        }
        if (taxi instanceof BoardingPassenger){
            ((BoardingPassenger) taxi).boarding(2);
        }


    }
}
