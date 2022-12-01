package Bangun_Datar;
import java.util.Scanner;
public class Method 
{
	static Scanner ricky = new Scanner(System.in);
	//method tanpa nilai balik dan tanpa parameter
	public static void hitungLuas_Segitiga ()
	{
		//deklarasi
		int alas, tinggi;		//variabel input
		double luas;			//variabel output
		
		
		//input
		System.out.print("Masukkan Alas = ");
		alas = ricky.nextInt();
		System.out.print("Masukkan Tinggi = ");
		tinggi = ricky.nextInt();
		
		//proses
		luas = (double) (alas*tinggi)/2;
		
		//output
		System.out.println("Luas Segitiga = " + luas);
		
	}
	
	public static void hitungLuas_PersegiPanjang ()
	{
		//deklarasi
		int panjang, lebar;		//variabel input
		double luas;			//variabel output
		
		
		//input
		System.out.print("Masukkan Panjang = ");
		panjang = ricky.nextInt();
		System.out.print("Masukkan Lebar = ");
		lebar = ricky.nextInt();
		
		//proses
		luas = (double) (panjang*lebar);
		
		//output
		System.out.println("Luas Persegi Panjang = " + luas);
		
	}
	public static void hitungLuas_Lingkaran ()
	{
		//deklarasi
		int r;					//variabel input
		double luas, phi;			//variabel output
		
		phi = 3.14;
		
		//input
		System.out.print("Masukkan Jari - Jari = ");
		r = ricky.nextInt();
		
		
		//proses
		luas = (double) (phi*r*r)/2;
		
		//output
		System.out.println("Luas Lingkaran = " + luas);
		
	}
	public static void hitungLuas_Trapesium ()
	{
		//deklarasi
		int tinggi, sisiSejajar1, sisiSejajar2;				//variabel input
		double luas;										//variabel output
		
		
		//input
		System.out.print("Masukkan Sisi Sejajar Ke 1 = ");
		sisiSejajar1 = ricky.nextInt();
		System.out.print("Masukkan Sisi Sejajar Ke 2 = ");
		sisiSejajar2 = ricky.nextInt();
		System.out.print("Masukkan Tinggi = ");
		tinggi = ricky.nextInt();
		
		//proses
		luas = (double) (tinggi * (sisiSejajar1 + sisiSejajar2))/2;
		
		//output
		System.out.println("Luas Trapesium = " + luas);
		
	}
	public static void hitungLuas_JajarGenjang ()
	{
		//deklarasi
		int alas, tinggi;		//variabel input
		double luas;			//variabel output
		
		
		//input
		System.out.print("Masukkan Alas = ");
		alas = ricky.nextInt();
		System.out.print("Masukkan Tinggi = ");
		tinggi = ricky.nextInt();
		
		//proses
		luas = (double) (alas*tinggi);
		
		//output
		System.out.println("Luas Jajar Genjang = " + luas);
		
	}
	
	
	public static void main(String[] args)  //method utama 
	{
		
		
		String ulang = "Ya";
		while(ulang.equalsIgnoreCase("Ya"))
		{
			System.out.print("1. Segitiga \n2. Persegi Panjang \n3. Lingkaran \n4. Trapesium \n5. Jajar Genjang");
			System.out.print("\n-----------------------------------------------------");
			System.out.print("\nPilih Menu = ");
			int menu = ricky.nextInt();
			System.out.print("-----------------------------------------------------\n");
			
			
			switch(menu)
			{
				case 1:
				{
					hitungLuas_Segitiga();
				}break;
				case 2:
				{
					hitungLuas_PersegiPanjang();
				}break;
				case 3:
				{
					hitungLuas_Lingkaran();
				}break;
				case 4:
				{
					hitungLuas_Trapesium();
				}break;
				case 5:
				{
				hitungLuas_JajarGenjang();
				}break;
			}
		System.out.print("\nApakah Anda Ingin Mengulang = " );
		ulang = ricky.next();	
		}	
		
	}
}
