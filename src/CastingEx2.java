package src;

public class CastingEx2 {
    public static void main(String[] args) {
        int i = 10;
        byte b = (byte) i;
        System.out.printf("[int -> byte] i = %d -> b = %d%n", i, b);

        i = 300;
        b = (byte) i;
        System.out.printf("[int -> byte] i = %d -> b = %d%n", i, b);
        // int타입에서 byte타입으로 형변환 시 값 손실이 있을 수 있다. 2진수로 변환해서 크기만큼 잘려나감.
        // byte타입에서 int타입으로는 작은 것을 큰 그릇에 담는 꼴이기 때문에 값 손실이 발생하지 않고 대신 빈공간은 0또는 1(음수)로
        // 채워진다.
        b = 10;
        i = (int) b;
        System.out.printf("[byte -> int] b = %d -> i = %d%n", b, i);

        b = -2;
        i = (int) b;
        System.out.printf("[byte -> int] b = %d -> i = %d%n", b, i);

        System.out.println("i = " + Integer.toBinaryString(i));
        // 마지막 i의 값 -2를 2진수로 출력

    }
}
