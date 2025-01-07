class Q1{
	public static void main(String[]args){
		printNum();
	}
	//main method
	
	
	
	// Method to print numbers with specific messages for 3 and 5
	static void printNum(){
		for(int i=1;i<8;i++){
			if(i==3)
			{System.out.println("I am 3");}
			else if(i==5)
			{System.out.println("I am 5");}
			else
			{System.out.println(i);}
	    	}
	}	
}