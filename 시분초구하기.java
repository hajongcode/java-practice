import java.util.Scanner;

public class 시분초구하기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("초 입력 : ");
        int sec = sc.nextInt();

        //입력받은 초를 시간 분 초로 출력하기
        int hour = sec/3600;
        int minute = sec%3600/60;
        int second = sec%60;

        System.out.println("입력된 시간은"+hour+"시"+minute+"분"+second+"초 입니다1.");


    }
}