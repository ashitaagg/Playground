#include<stdio.h>
#include<stdlib.h>
void check_sum_and_display(int arr[], int size, int sum);
int main()
{
    // Get the size of an array
    int size;
    scanf("%d", &size);
    
    // Get the array elements
    int arr[50], i;
    for(i=0; i<size; i++)
    {
        scanf("%d", &arr[i]);
    }
    
    // Get the sum value (to check with an array elements)
    int sum;
    scanf("%d", &sum);
    
  	// Function call to check the sum of any two elements in an array equal to given sum 
  	// and display the same
    check_sum_and_display(arr, size, sum);
    return 0;
}

void check_sum_and_display(int a[], int n, int sum)
{
  int s,f=0;
 for(int i=0;i<n;i++)
 {
   for(int j=i+1;j<n;j++)
   {
     s=a[i]+a[j];
     if(s==sum)
     {
       printf("Perfect couple: %d %d",a[i],a[j]);
       f=1;
     }
   }
 }
  if(f==0)
    printf("No perfect couple found!");
}