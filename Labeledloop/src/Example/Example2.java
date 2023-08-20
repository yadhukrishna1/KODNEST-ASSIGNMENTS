package Example;

public class Example2 {
	public static void main(String[] args) {
		  System.out.println("START");
			int i=1;
			first :do
			{
				i++;
				int j=1;
				sec :do
				{
					System.out.print("* ");
					j++;
				break sec;
				}while(j<=5);
			}while(i<=5);
			System.out.println();
		}
		}

