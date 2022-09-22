//Reads a date (from 2004/1/1 to 2004/12/31) and prints the day of the date. Jan. 1, 2004, is Thursday. Note that 2004 is a leap year. (leap years: Nam nhuan (thang 2: 29ngay))

import java.util.Scanner;

public class Ws2o10 {

    static String readDate(int month, int day){
        String date[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int monthDay[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int curentDate = 3; //Vị trí date đầu tiên: Thursday
        //Tính xem là từ ngày 1/1 ->  month hiện tại cần tìm là bao nhiêu ngày.
        for(int i=1; i<month; i++) curentDate += monthDay[i-1];//Do i là 1 mà phần tử đầu tiên của mạng là 0.
        //Tính thêm số ngày của month từ 1/month -> day/month.
        curentDate += day-1;
        //Tính xem là thứ mấy sau currentDate ngày.
        return date[(curentDate%7)];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        System.out.println(readDate(month, day));
    }
}
