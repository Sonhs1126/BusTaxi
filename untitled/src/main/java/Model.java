public class Model {
    int num; //번호
    int oil; //주유량
    int speed; //속도
    int speedChange; //속도변경
    int maxPassenger; //최대 승객 수
    int price; //요금
    String state; //상태

    public Model() {
        this.num = num;
        this.oil = oil;
        this.speed = speed;
        this.speedChange = speedChange;
        this.maxPassenger = this.maxPassenger;
        this.price = price;
        this.state = state;
    }

    public Model(int num, int oil, int speed,int maxPassenger, int price, String state){

    }
}










// public Model(int num,int speed,int speedChange){
//        this(num,speed,speedChange,0,0,0,"운행중");
// }
// public String getState() {
//
//     return "(" + state + ")";
// }
//    public String getDrive() {
//
//        return "(" + speedChange + ")";
//    }
//
// public String getmaxpassenger(){
//     return  "(" + maxPassenger +")";
//     }
//
//
//    protected void printBus(){
//        System.out.println("현재버스는"+ state + "입니다" +getState());
//        System.out.println("최대승객수는"+ maxPassenger + "입니다" +getmaxpassenger());








