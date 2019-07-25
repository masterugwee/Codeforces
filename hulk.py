x = int(input())
love = "I love it"
hate = "I hate it"
love2 = "I love that"
hate2 = "I hate that"
s = ""
for i in range(1,x+1):
 if(i!=x):
  if(i%2!=0):
    if(i==1):
     s = s+hate2
    else:
     s=s+" "+hate2
  else:
   s = s+" "+love2
 elif(i==x):
  if(x%2 == 0):
   s = s+" "+love
  else:
   s = s+" "+hate

print(s)
