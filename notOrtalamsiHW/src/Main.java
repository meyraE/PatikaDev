import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Once degiskenleri oluşturuyoruz.
        int matematik, fizik, kimya, turkce, tarih, muzik;

        //Scanner sınıfını tanımlıyoruz.
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        matematik = input.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();

        System.out.print("Turkçe Notunuz : ");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = input.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = input.nextInt();

        double ort = (fizik + kimya + turkce + tarih + muzik) / 6.0;

        boolean kats = ort > 60;

        String sonuc = kats ? "Sınıfı Geçti " : "Sınıfta Kaldı ";
        System.out.println(sonuc);
    }
}