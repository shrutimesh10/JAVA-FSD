class Example1{
   public static void main(String args[]){
	try{
		System.out.println("Starting of try block");
		// I'm throwing the custom exception using throw
		throw new MyException("This is My error Message");
	}
	catch(MyException exp){
		System.out.println("Catch Block") ;
		System.out.println(exp) ;
	}
   }
}
