import java.util.Scanner;
class Bmi
{
    public static void main(String args[])
	{
	Scanner input= new Scanner(System.in);
	System.out.println("Selamat Datang Ke Sistem Pengiraan BMI");
	System.out.println("Sila Masukkan Maklumat Tersebut;");
	System.out.print("Nama : ");
	String nama= input.nextLine();
	System.out.print("Umur : ");
	int umur=input.nextInt();
	
	System.out.print("Berat : ");
	double berat=input.nextDouble();
	System.out.print("Tinggi : ");
   	double tinggi=input.nextDouble();
	double bmi= berat / (tinggi*tinggi);
	
	System.out.println("BMI ANDA IALAH : "+bmi);
	

	}
}