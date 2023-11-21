package CI306.Zarytskyi.Lab_6;

public class MyClass<T1, T2> implements MyInterface<T1, T2> {

	@Override
	public void print_data(T1 data1, T2 data2) {
		System.out.println("Інформація про екземпляр класу T1 :" + data1);
		System.out.println("Інформація про екземпляр класу T2 :" + data2);
	}

}
