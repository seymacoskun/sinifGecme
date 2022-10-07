package sinifGecme;
import java.util.Scanner;

public class Sinif 
{
	public static void main(String[] args) 
	{
		int mat, fizik, kimya, turkce, muzik;
		double ortalama;
		double toplam = 0;
		int dersSayisi = 5;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Matematik notunu giriniz: ");
		mat = input.nextInt();
		if(mat >= 0 && mat <= 100) 
		{
			toplam += mat;
		    }else {dersSayisi -= 1;}
		
		System.out.println("Fizik notunu giriniz: ");
		fizik = input.nextInt();
		if( fizik >= 0 && fizik <= 100){
			toplam += mat;
		}else {dersSayisi -= 1;}
		
		System.out.println("Kimya notunu giriniz: ");
		kimya = input.nextInt();
		if(kimya <= 100 && kimya >= 0) {
			toplam += kimya;
			}else {dersSayisi -= 1;}
		
		System.out.println("Turkce notunu giriniz: ");
		turkce = input.nextInt();
		if(turkce >= 0 && turkce <= 100) {
			toplam += turkce;
		}else {dersSayisi -= 1;}
		
		System.out.println("Muzik notunu giriniz: ");
		muzik = input.nextInt();
		if(muzik <= 100 && muzik >= 0) {
			toplam += muzik;
		}else {dersSayisi -= 1;}
		
		if(dersSayisi != 0) {
			ortalama = toplam/dersSayisi;
			if(ortalama <= 55) 
			{
				System.out.println("Sinifta kaldiniz. Seneye gorusmek uzere...");
			}else {
				System.out.println("Tebrikler. Sinifi gectiniz. ");
			}
			
			System.out.println("Ortalamaniz: " +ortalama);
		}
		
		else {
			System.out.println("Puanlar 0-100 araliginda olmadigi icin ortalama hesaplanamadi! ");
		}
		
	}
}
