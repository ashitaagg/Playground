#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n];
  
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  int temp,i,j;
  for(i=0;i<n/2;i++)
  {
    for(j=0;j<n/2;j++)
    {
      if(a[i]<a[j])
      {
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
      }
    }
  }
  for( i=0;i<n;i++)
  printf("%d ",a[i]);
  
	return 0;
}