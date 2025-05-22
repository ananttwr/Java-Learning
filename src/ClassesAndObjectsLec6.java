/*
9/5/25 Classes And Objects Lec6
*/


public class ClassesAndObjectsLec6 {

/*
Why Class?

primitive data type mein kya hota, agr student ka name, age, hobby, etc. store krna hai toh alag alag data type bnayenge but
in sb ko ek sth ek group mein rkhne k liye ki ye ek student ka info. hai, toh ek class bna k usmei sara data type ko store kr denge

aese 10 student k liye 10*5 = 50 variable bnana pdta. ek class bnayenge usmei saare real world obj./ enities ka data obj bnakr
store krnge

Class is a desc. of objects property(data types like name, age), and behaviour (methods), its blueprint
	
obj - instance of class, real world entity, consumes memory to hold property and value. think of this like a big variable, it is ex of that blueprint
*/


// Q. - Define a class box with l, b, h as member variable also define setDimension() and showDimension() as member fns

	static class Box {		// default access specifier, and making inner class static so that we can create obj inside static main method without creating outer class obj
		private int length, breadth, height;		// properties(variables) of this class, these are instance member variable jb instance create krnge tbhi bnega aese nhi

		// qs -- isnt it necessary to use methods name in CamelCase
		// Ans -- Not necessary but good practice

		/*

		🧱 Java Naming Conventions (recap):
		Element	Convention	Example
		Class	PascalCase	StudentInfo, Box
		Method	camelCase	setDimension()
		Variable	camelCase	length, totalSum
		Constant	UPPER_SNAKE	MAX_SIZE, PI

		*/

		// qs -- second ki instance member bhi instance variable ki trh at time of obj creation only create hoga else nhi??
		// Ans -- Yes!, Instance variables and methods are tied to an object.
		// They are stored in the object’s memory space and are created only when the object is instantiated.

		public void setDimension(int l, int b, int h) {		// instance member fn for setting the value we will get in th params of fn
			// to our objs of the class
			length = l;
			breadth = b;
			height = h;
		}
		public void showDimension() {		// member fn for showing the dimension of obj
			System.out.println("length=" + length);
			System.out.println("breadth=" + breadth);
			System.out.println("height=" + height);
		}
	}

	public static void main(String[] args) {			// it is main fn of this java file, every execution will start from here
		// Creating Objects in Java
		// In java we can only create objs. dynamically not statically

		// Box box1; // isse bs ek variable bnega niche wale se obj.

		Box box1 = new Box();		// box1 reference variable h ye address store krega new Box() krke jo obj create hua h uska
		// 17/5 error because Box was a non-static inner class, and you tried to create it inside a static method (main()).
		// Fix for this make inner class static so that no need to create obj of outer class for accessing it


		// why are we using Box to create box1 reference variable, just like we use to create int(primitive data type) variable_name
		// Box is a class which is user defined data type
		// java mein obj ka naam nhi hota yahi reference variable hi naam ki trh use ho jayega
		// we can handle objs by only ref. variable

		// just for ex. ref variable aese bhi create kr skte h
		Box box2;		// it is also fine bs ek variable create ho jayega jbtk kisi obj ko point nhi krwate empty rhega
		box1.setDimension(12, 15, 4);		// calling obj and passing the params to set in the variables
		box1.showDimension();				// not passing any arg as it isnt expecting, it will use the l,b,h of the curr obj and print
	

		box1 = new Box();		// again creating new obj of Box class, bt storing its address in the old ref variable so it 
		// will point to the newly created obj and the old obj with its value will go in garbage collection
		box1.showDimension();	// 0,0,0 will be printed as we haven't assigned any value till now, and instance variable mein nhi krne se 0 hota hai

	}
}
