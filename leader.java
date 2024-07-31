class Leader 
{
public static void main(String args[])
{ 
	int i,j;
	int a[]={3,8,6,7,5};
	for(i=0;i<5;i++)
	{
		for(j=i+1;j<5;j++)
		{
			if(a[i]>a[j])
				System.out.println(a[i]+" is leader");
			else
				System.out.println(a[i]+" is nota leader");
			break;
		}
	}
}
}

				
	
