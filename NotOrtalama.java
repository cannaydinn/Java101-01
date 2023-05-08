import java.util.Scanner;

public class NotOrtalama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int mat,fizik,kimya,turkce,tarih,muzik;
		
		System.out.print("Matematik notunu giriniz: ");
		mat = sc.nextInt();
		
		System.out.print("Fizik Notunu giriniz: ");
		fizik = sc.nextInt();
		
		System.out.print("Kimya notunu giriniz: ");
		kimya = sc.nextInt();
		
		System.out.print("Turkce Notunu giriniz: ");
		turkce = sc.nextInt();
		
		System.out.print("Tarih notunu giriniz: ");
		tarih = sc.nextInt();
		
		System.out.print("Müzik notunu giriniz: ");
		muzik = sc.nextInt();
		
		int toplam = mat + fizik + kimya + turkce + tarih + muzik;
		double ortalama = toplam / 6;
		
		System.out.println("Not ortalamanız ");
		
		System.out.print(ortalama >= 60 ? "Sınıfı geçti" : "Sınıfta Kaldı");

	}

}
