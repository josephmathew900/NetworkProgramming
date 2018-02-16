#include<stdio.h>
#include<stdlib.h>
#include<pthread.h>

void *myThread(void *vargp)
{
 sleep(1);
 printf("Inside myThread\n");
 return NULL;
}

int main()
{
 pthread_t tid[3];
 int i;
 printf("Before thread\n");
 for (i = 0; i < 3; i++)
 {
  pthread_create(&tid[i],NULL,myThread,NULL);
  pthread_join(tid[i],NULL);
}
 printf("After thread\n");
 exit(0);
}


