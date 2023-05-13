package section2;

//변수, 리터럴, 상수를 활용하여 원의 면적을 구하는 프로그램 작성하기
public class CircleArea {

//    public static double area(int r) {
//        return r * r * 3.14;
//    }

    public static void main(String[] args) {
        final double PI = 3.14; //원주율을 상수로 선언

        double radius = 10.0;
        double circleArea = radius * radius * PI; //원의 면적 계산

        //원의 면적을 화면에 출력한다.
        System.out.println("circleArea = " + circleArea);
    }
}
