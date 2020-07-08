//
// Created by User on 08-Jul-20.
// or mayre bap correct eita

#include <bits/stdc++.h>
using namespace std;

map<int,int> primeFactorsMap(int j){
  map<int,int> m;
  for (int n1=2;n1<=j;n1++) {
    int n=n1;
    while (n % 2 == 0) {
      m[2] += 1;
      n = n / 2;
    }
    for (int i = 3; i <= sqrt(n); i = i + 2) {
      while (n % i == 0) {
        m[i] = m[i] + 1;
        n = n / i;
      }
    }
    if (n > 2)
      m[n] += 1;
  }
  return m ;
}
int main(){
  int t;
  cin >> t;
  for (int t1=1;t1<=t;t1++){
    int n,c=0;
    cin >> n;
    map<int,int> m=primeFactorsMap(n);
    printf("Case %d: %d = ", t1, n);
    map<int, int>::iterator itr;
    for (itr=m.begin();itr!=m.end();++itr){
      printf("%d (%d)",itr -> first, itr -> second);
      c++;
      if (c!=m.size()) {
        cout << " * ";
      }
    }
    printf("\n");
  }
  return 0;
}
