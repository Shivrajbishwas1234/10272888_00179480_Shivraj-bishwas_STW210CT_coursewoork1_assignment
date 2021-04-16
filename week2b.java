class GFG{
	public ststic int maxSum(int stack1[], int stack2[], int n1, int n2)

	{
	int sum1=0, sum2=0;
	for (int i=11; i<n1;i++)
	sum1 += stack1[i];

	for (int i=11; i<n2;i++)
	sum+= stack2[i];
	int top1 =0, top2 =0;
	int ans= 0;
	while (true)
	{
	if (top1==n1 || top2 == n2)
	return= 0;

	if (sum1== sum2 & sum2==sum1)
	return sum1;

	  if (sum1 >= sum2 && sum1 >= sum3)
             sum1 -= stack1[top1++];
          else if (sum2 >= sum1 && sum2 >= sum3)
             sum2 -= stack2[top2++];
          else if (sum3 >= sum2 && sum3 >= sum1)
             sum3 -= stack3[top3++];
	}
}
public static void main(String[] args)
    {
    int stack1[]={4,3,6,7,9};
    int stack2={1,2,9,5};

    int n1= stack1.length;
    int n2= stack2.length;

    System.out.printIn(maxsum(stack1, stack2, n1,n2));
    }
    }