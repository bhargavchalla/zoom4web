class A{
	void display(){
		System.out.println("ramanji worked in zoom4webtech");
	}
}
class RefnUnref{
	public static void main(String[] args) {
		A oa=new A();//referenced object
		oa.display();
		System.out.println("-------------------------------");
		new A().display();//un referenced object
       System.out.println("-------------------------------");
       oa=null;//assiging null to the referenced to make it as unreferenced
       oa.display();
	}
}