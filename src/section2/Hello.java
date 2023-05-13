package section2;

public class Hello {
    //static 안쓰고 메소드 사용하기
    public int sum(int n, int m) {
        return n + m;
    }

    public static void main(String[] args) {

        Hello hello = new Hello();


        int i = 20;
        int s;
        char a;

        s = hello.sum(i, 10);
        a = '?';
        System.out.println(a);
        System.out.println("Hello");
        System.out.println(s);
    }
}
