public class PenggunaanSuperKonstruktor{
	int age;

	PenggunaanSuperKonstruktor(int age){
		this.age = age;
	}

	public void getAge(){
		System.out.println("Umur pada super kelas: " +age);
	}
}