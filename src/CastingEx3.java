package src;

public class CastingEx3 {
    public static void main(String[] args) {
        float f = 9.1234567f;
        double d = 9.1234567;
        double d2 = (double) f;

        System.out.printf("f = %20.18f\n", f);
        System.out.printf("d = %20.18f\n", d); // 정밀도의 차이때문에 값이 다름.
        System.out.printf("d2 = %20.18f\n", d2);
        // 저장할 떄 이미 값이 달라졌기 때문에 형변환을 한다고 해서 값이 다시 같아지지 않는다.
    }
}
