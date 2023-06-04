import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soNuocSuDung = Integer.parseInt(sc.nextLine());
        TienNuoc tinhTienNuoc = new TienNuoc(soNuocSuDung);
        System.out.println(tinhTienNuoc.tinhTienNuoc());
    }
}
