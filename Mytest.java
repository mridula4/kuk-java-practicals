// Java program Find Out the Number of Objects Created of a Class 
class MyTest 
	{ 
       	static int noOfObjects = 0; 
		// instance block is used
		{ 
			noOfObjects += 1; 
		} 
		// various types of constructors to create objects
		public MyTest() 
		{ 
		} 
		public MyTest(int n) 
		{ 
		} 
		public MyTest(String s) 
		{ 
		} 
		public static void main(String args[]) 
		{ 
			MyTest t1 = new MyTest(); 
			MyTest t2 = new MyTest(5); 
			MyTest t3 = new MyTest("GFG");  
			System.out.println(MyTest.noOfObjects); 
		} 
	}
