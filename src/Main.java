import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so ");
        int number = sc.nextInt();
        boolean check = true;
      if(number<2){
          System.out.println( number + " k phai la so nt");
      }else {
          for (int i = 2 ; i < number ; i ++ ){
              if(number % i == 0){
                  check = false;
                  break;
              }else {
                  check = true;
              }
          }
      }
        if(check == true){
            System.out.println( number + " la so nt");
        }else {
            System.out.println( number + " khong la so nt");
        }
    }
}
