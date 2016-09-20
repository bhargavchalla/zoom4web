class A{
void dispaly(){
	System.out.println("zoom4web");
      }	
}
class B{
	void dispaly(){
		A oa=new A();//method called inside user-defined method
		oa.dispaly();
			System.out.println("----------------------------");
			new A().dispaly();
					System.out.println("----------------------------");
	}
}
class MethodCall{
	public static void main(String[] args) {
		B ob =new B();
		ob.dispaly();//method called inside main method
		System.out.println("----------------------------");
		new B().dispaly();
	}
}