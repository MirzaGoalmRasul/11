public class Arraysum{
	public static void main (String []arg){
		int []a= new int[]{2,4,4,4};
		int sum=0;
		for(int i=0;i<4;i++)
		{
		sum=sum+a[i];
		}
		System.out.println("the sum is :"+ sum);
}}