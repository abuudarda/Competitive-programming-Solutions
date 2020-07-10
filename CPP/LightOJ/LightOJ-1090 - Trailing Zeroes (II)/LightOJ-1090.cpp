//
// Created by User on 10-Jul-20.
//

#include <bits/stdc++.h>
#define LL long long
using namespace std;

int ninN(int a,int b) {
  int c = 0;
  while (!(a % b)) {
    c++;
    a /= b;
  }
  return c;
}

int nInNfac(int a,int b){
  int c=0;
  while (a>0){
    c+=a/b;
    a/=b;
  }
  return c;
}
int main(){
  int t1;
  scanf("%d", &t1);
  for (int i=1;i<=t1;i++) {
    int n, r, p, q;
    scanf("%d %d %d %d", &n, &r, &p, &q);
    int f, t, z;
    z = 5;
    f = ((nInNfac(n, z) + ninN(p, z) * q)) - (nInNfac(r, z) + nInNfac(n - r, z));
    z = 2;
    t = (nInNfac(n, z) + ninN(p, z) * q) - (nInNfac(r, z) + nInNfac(n - r, z));
    printf("Case %d: %d\n", i, min(f,t));
  }
}
