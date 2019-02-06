public class Runner {
    public static void main(String [] args){

        Car myCar=new Car(2005,"mini cooper", 100, "mini");
        myCar.setMiles(1050);

        System.out.println(myCar.toString());
        Rectangle myRect= new Rectangle(100,100);
        System.out.println(myRect.getArea());
        System.out.println(myRect.isSquare());
        System.out.println(myRect.getDiagonal());
    }
}
