#include<iostream>
using namespace std;
int main() {
  int n ;
  cin>>n;
  int i=2;
  while (i<n)
  {
    if(n%i==0){

    
    /* code */
    cout<<"NOT PRIME "<< i <<endl;
  }else
  {
    /* code */
    cout<<"PRIME "<< i <<endl;
  }
  i=i+1;
  }
}