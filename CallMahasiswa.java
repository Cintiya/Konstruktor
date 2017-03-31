import java.util.Scanner;

public class CallMahasiswa{
	public static void main (String[] args){


		Scanner masukan = new Scanner (System.in);
		int NIM;
		char Jurusan;

		System.out.print("Masukan NIM: ");
		NIM = masukan.nextInt();

		System.out.print("Masukan Jurusan: ");
		Jurusan = masukan.next().charAt(0);

		System.out.println("=====================");

		Mahasiswa mhs = new Mahasiswa ("Mahasiswa");
		System.out.println(mhs.nama);
		System.out.println(NIM);
		System.out.println(Jurusan);

	}
}