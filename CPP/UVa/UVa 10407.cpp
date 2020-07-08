//
// Created by Darda on 08-Jul-20.
//
//No need to use the gcd function for c++ above 17

#include <bits/stdc++.h>
#define LL long long
using namespace std;

int gcd(int a,int b){
  if(b==0)return a;
  else return gcd(b,a%b);
}


int vectorErGCD(vector<int> v){
  int n=v.at(0);
  for (int i=1;i<v.size();i++)
    n=gcd(n,v.at(i));
  return n;
}

int main() {
  vector<int> v;
  while (true) {
    int n = 0;
    cin >> n;
    if (n == 0) break;
    v.push_back(n);
    while (true) {
      cin >> n;
      if (n == 0) break;
      v.push_back(n);
    }
    vector<int> v1;
    for (int i=0;i<v.size()-1;i++)
      v1.push_back(abs(v.at(i)-v.at(i+1)));
    cout << vectorErGCD(v1) << endl;
    v1.clear() ;
    v.clear();
  }
  return 0;
}
