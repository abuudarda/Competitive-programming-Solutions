//
// Created by Darda on 09-Jul-20.
//

#include <bits/stdc++.h>
#define LL long long
using namespace std;

int phi(int n) {
  int result = n;
  for (int i = 2; i * i <= n; i++) {
    if (n % i == 0) {
      while (n % i == 0)
        n /= i;
      result -= result / i;
    }
  }
  if (n > 1)
    result -= result / n;
  return result;
}


int main(){
  int t;
  cin >> t;
  while (t--){
    int n,c=0;
    scanf("%d", &n);
    printf("%d\n",phi(n));
  }
  return 0;
}
