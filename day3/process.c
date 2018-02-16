#include<stdio.h>
#include<sys/types.h>
void main()
{
  pid_t pid;
  pid = fork();

  if(pid == -1)
  {
    printf("can't fork");
  }

 else if(pid == 0)
 {
   printf("child is %d\n",getpid());
 }

 else
 {
  printf("\nparent is %d\n",getppid());
 }

}
