#include <stdio.h>
int main(){
	int n;
 int count=0;
  scanf("%d\n",&n);
  for(int i=1;i<=n;i++)
  {
    for(int j=1;j<=i;j++)
    {
      count++;
      if(count%2==1)
      printf("*");
      else
        printf("#");
    }
    printf("\n");
  }
      return 0;
}