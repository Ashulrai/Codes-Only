#include<stdio.h>
void  Hello();
void Bonjour();

int main() {
  char ch;
  
printf("Enter i For INDIA and Enter f For French : ");
scanf("%c ",&ch);

if (ch == 'i')
{
  /* code */
  Hello();
}else if (ch == 'f')
{
  /* code */
  Bonjour();
}else{
  printf("iNVALID INPUT !!!!!!!!!!!!!!");
}
  return 0;
}

void Hello(){

  printf("Hello Mr. !!!!!");
}
 
 
void Bonjour(){
  printf("Bonjour !!!!!");
}