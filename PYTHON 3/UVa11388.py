t=int(input())
for t1 in range (t):
	a,b=list(map(int, input().split()))
	print ("-1" if b%a!=0 else str(a)+" "+str(b))
