import math
while True :
    n=int(input())
    if n is 0 : break
    print("yes" if math.sqrt(n)%1==0 else 'no')
