class Bike{
	String name;
	int id;
	String size;
	String colour;
	int price;
	
	public void display() {
		System.out.println("details of bike:");
	}
	
}
class Example{
	public static void main(String args[]) {
		Bike obj=new Bike();
		obj.display();
		obj.name="honda";
		obj.id=123;
		obj.size="large";
		obj.colour="black";
		obj.price=100000;
		System.out.println(obj.name);
		System.out.println(obj.id);
		System.out.println(obj.size);
		System.out.println(obj.colour);
		System.out.println(obj.price);
	}
}
