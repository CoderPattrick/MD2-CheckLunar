import java.util.Scanner;

public class CheckLunar {
    public static void main(String[] args) {
        System.out.println("Nhập năm cần ktra năm nhuận:");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        String text;
        if(year%4==0){
            if(year%100!=0){
                text = " là năm nhuận.";
            }
            else {
                if (year % 400 == 0) {
                    text = " là năm nhuận.";
                }
                else {
                    text = " không phải năm nhuận.";
                }
            }
        }
        else {
            text = " không phải năm nhuận.";
        }
        System.out.printf("%d%s",year,text);
    }
}
