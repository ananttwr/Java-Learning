/*
7/5/25 first program lec3
In java file is class, and class and file names are same
*/

public class FirstProgramLec3 {

/*
In java we have to write access specifier before class public, pvt, protected, nothing written default
outer class cant be pvt and protected only public or default
class name should be in camel case professional way of java FirstProgramLec3 to easily understand it is class
this is first_program_lec_3 c++ style not wrong but not professional
 */

    public static void main(String[] args) {    // This is a method/ fn inside class, we cant create methods without class in java

        /*
        public - so that jvm can access this method
        static - like py static method can be called without creating obj, with class name only
        String[] args - will study further, arr of string as arguments, no usage in this program but cant change the definition
        -- more on this in cmd line arguments lec
         */

        System.out.println("Hello and welcome!");

        /*
        S caps meaning it is class, dot after class name tells we are accessing static member of class like py
        static member can be variable, fn
        out is reference variable(stores address of obj like pointer)
        which is pointing to an obj of PrintStream Class
        dot after out tells we are accessing member fn of that obj
         */
    }
}

// no semicolon needed after class