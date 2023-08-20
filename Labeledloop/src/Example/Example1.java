package Example;
public class Example1 {
	public static void main(String[] args) {
	  System.out.println("START");
		int i=1;
		first :do
		{
			
			int j=1;
			sec :do
			{
				System.out.print("* ");
				j++;
				break sec;
			}while(j<=5);
	i++;
		}while(i<=3);
		System.out.println();
	}
	}