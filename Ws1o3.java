import java.util.Scanner;

/*Nhập bàn phím tổng thoi gian theo s => In ra gio, phút ,giây*/

public class Ws1o3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long time = sc.nextLong();
        long hour = 0, minute = 0, sec = 0;
       
        while(time>=3600){
            hour += 1;
            time -= 3600;
        }
        while(time>=60){
            minute += 1;
            time -= 60;
        }
        sec = time;
        System.out.println(hour + " " + minute + " " + sec);
    }
}
