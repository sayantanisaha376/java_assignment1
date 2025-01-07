class Q5{
	public static void main(String[]args){
	sumOfEven();
	// Method to call sum of even numbers
	
	
	// Method to calculate and print the sum of even numbers from 1 to 20
	static void sumOfEven(){
		int sum=0;
		for(int i=1;i<=20;i++)
			if(i%2==0){
				sum+=i;
			}
		{
			System.out.println("The sum of even numbers from 1 to 20 is:"+sum);
		}
	}
}