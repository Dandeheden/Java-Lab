class Leader 
{
public static void main(String args[])
  { 
	int i,j;
	int a[]={-2,1,-3,4,-1,2,1,-5,4};
	for(i=0;i<8;i++)
	{
		int max=a[i];
		 for(j=i+1;j<9;j++)
		  {
			if(a[j]>max)
			max=a[j];
			
		   }
		if(a[i]==max)
		  System.out.println(max+" is a leader");
	}
   }
}

				
	
