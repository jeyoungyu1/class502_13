package exam03;

import java.text.DecimalFormat;

public class Ex01 {
    public static void main(String[] args) {
        double num1 = 100000000.123;

        DecimalFormat df = new DecimalFormat("0,000.0000"); // 남아있는 자리 채움
        String num1Str = df.format(num1);
        System.out.println(num1Str);

        DecimalFormat df2 = new DecimalFormat("#,###.####"); //남아있는 자리 무시
        String num1Str2 = df2.format(num1);
        System.out.println(num1Str2);



    }
}
