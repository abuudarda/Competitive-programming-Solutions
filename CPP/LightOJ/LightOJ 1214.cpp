//
// Created by Darda on 08-Jul-20.
//
#include <bits/stdc++.h>
#define LL long long
using namespace std;
string negrem(string s){
  if (s[0]=='-') s.erase(s.begin());
  return s;
}

int main() {
  int t;
  cin >> t;
  for (int t1 = 1; t1 <= t; t1++) {
    string a;
    LL n,scope=0;
    cin >> a >> n;
    a=negrem(a);
    for (char i : a) {
        scope=(scope*10)+(i-'0');
        scope%=n;

    }
    printf("Case %d: ", t1);
    if (scope) cout << "not divisible" << endl;
    else cout << "divisible" << endl;
  }
  return 0;
}
