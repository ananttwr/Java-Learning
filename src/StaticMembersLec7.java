/*
22/5/25 ------------- Static Members Lec7
*/

/*
------------ Example to understand need of static

Lets say Class is Account,
balance will be instance var bcz it will be diff for each user means obj specific,
but lets say Rate of Interest will be same across all the users so will keep it static once created for class and same
for all the users

*/

public class StaticMembersLec7 {

    // ---------- instance variable
    int x;      // --> jb obj bnega class ka tb ye variable bnega uske andrr

    // -------------- static variable
    static int y;

    // ---------------- instance member fn
    public void fun1() {
        // --> obj k through hi call hoga

        // static int a;       // ---------> we cannot have static variable in methods

        //  NOTE --> we can have static member variable, static member fn, also we can have static inner class but not static variable in methods
    }

    // ---------------- static member fn
    public static void fun2() {
        // ------------ static fn can only access static vars/ members of the same class,

        // System.out.println(x); // ❌ Error: Cannot access non-static variable from static context

        // bcz A static method does not belong to an object, so it doesn't know which object's instance variables (x) it should access. That’s why the compiler gives an error.

        // but after creating an object inside a static method, you can access instance (non-static) variables and methods through that object.

        StaticMembersLec7 obj = new StaticMembersLec7();
        System.out.println(obj.x); // ✅ Now it's allowed
    }

    // ---------------- static inner class
    static class Example {
        static String country = "India";
    }

    public static void main(String[] args) {            // it is main fn of this java file, every execution will start from here

        // -------------- example of accessing static and instance variable

        // 1. both static and instance variables are by default initialized to default values (ex. for int it will be 0)
        // 2. x is instance var everytime the obj will be created it will be created but y is created without obj also and it is same across all the objs.

        StaticMembersLec7 s1 = new StaticMembersLec7();
        StaticMembersLec7 s2 = new StaticMembersLec7();

        StaticMembersLec7.y = 5;            // we can access static variables and methods by ClassName.(dot)varName
        y = 6;      // accessing static var without ClassName.(dot)varName will also work, as main is static member of same class

        // -------------- example of accessing static methods

        StaticMembersLec7.fun2();

        // -------------- example of accessing static class

        System.out.println(StaticMembersLec7.Example.country);

    }
}

