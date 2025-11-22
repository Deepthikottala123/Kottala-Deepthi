package tandemloop_projects;

public class Program4 
{
	public static void totalCount(int [] arr)
	{
		int [] count = new int[10];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<=count.length-1;j++)
			{
				if(arr[i]%j==0)
					count[j]++;
			}
		}
		System.out.print("{");
		for(int i=1;i<count.length;i++)
		{
			if(i<count.length-1)
				System.out.print(i+":"+count[i]+",");
			else
				System.out.print(i+":"+count[i]);
		}
		System.out.println("}");
	}
	public static void main(String[] args) 
	{
		int [] arr = {1,2,8,9,12,46,76,82,15,20,30};
		totalCount(arr);	
	}
}
