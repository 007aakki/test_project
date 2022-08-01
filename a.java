package ritik;

class a {
	int a = 5, b=3 ,c=4;
	static int d=5,e=6;
	public static void main(System args[]) {
		a ob= new a();
		System.out.println(ob.a+ob.b+ob.c+d+e);
		ob.a =ob.b+d;
		ob.b=ob.c+e;
		d= ob.a+ob.b;
		System.out.println(ob.a+ob.b+ob.c+d+e);
		a ob1 = new a();
		ob1.a=ob.a+ob1.b;
		ob1.b=ob1.a+ob1.c;
		e=ob1.a+ob1.b;
		System.out.println();
		a ob2 =new a();
		System.out.println(ob2.a+ob2.b+ob2.c+d+e);
		System.out.println("hey this is RITIK PAL");
	}

}
