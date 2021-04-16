class Main {
	// Function to ind missing number 

	static int getMissingNo(int a[], int n)
	{
		int i, total;
		total =(n+1) *(n+2)/2;
		for (i =0; i<n; i++)
			total -=a[i];
		return total;
	}
	/* program to test above function */
	public ststic void main (String args[])
	{
		int a[] ={2, 3, 5, 11, 17, 23};
		int miss = getMissingNO(a,5);
		system.out.printIn(miss);
	}
}