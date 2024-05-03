import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Hava sıcaklıgını derece cinsinden giriniz: ");
        int temp = scanner.nextInt();
        if (temp < 5) {
            System.out.println("kayak yapmayı deneyebilirsiniz");
        } else if (temp < 15) {
            System.out.println("sinemaya gidebilirsiniz");
        } else if (temp < 25) {
            System.out.println("pikniğe gidebilirsiniz");
        } else {
            System.out.println("yüzmeye gidebilirsiniz");
        }
    }
}