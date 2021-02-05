package src;

public class CastingEx4 {
    public static void main(String[] args) {
        int i = 91234567;
        float f = (float) i; // int -> float
        int i2 = (int) f; // float -> int

        double d = (double) i;
        int i3 = (int) d;

        float f2 = 1.666f;
        int i4 = (int) f2;

        System.out.printf("i = %d\n", i); // 정수형 -> 실수형 : 정밀도의 제한에 의해서 오차가 발생할 수 있음.
        System.out.printf("f = %f i2 = %d\n", f, i2); // 실수형 -> 정수형 : 소수점이하는 버려짐.
        System.out.printf("d = %f i3 = %d\n", d, i3);
        System.out.printf("(int)%f = %d\n", f2, i4);
    }
}
