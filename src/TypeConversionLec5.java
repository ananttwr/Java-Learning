/*
9/5/25 Type Conversion Lec5
*/


public class TypeConversionLec5 {

/*

Widening Conversion -- int apne aap ko bada kregi float mein store hone k liye
	int y = 3;
	float x = y;	// no Error 
No data loss here x will become 3.0

Narrowing Conversion -- bigger data type ko smaller mein convert, down grading is not possible in java, java doesn't allow it considers data loss hota hai
	float x = 3.4f;	
	int y = x; 	// Narrowing Conversion, error dega bada datatype ko smaller mein krne se data loss hoga 
	
	int y = (int)x; // type casting, forcefully bhi kre toh 3 hoga type cast (no error in this), but data loss hogya
	// int mein thode der k liye cast kiye x ko then, int y variable mein usko store kr liye
	
	float f = 3.5;	// error, bcz 3.5 is double and downgrading is not possible
	// double sbse bada h
	
*/
}
