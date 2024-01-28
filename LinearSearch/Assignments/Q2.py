# 2.

# input=[1,3,4,5,2,1]

# t=1

# o/p—>14

# t=5

# o/p—>11

def Count(arr,t):
    ans=0
    for i in range(len(arr)):
        if arr[i]!=t:
            ans=ans+arr[i]
    return ans        

ans1=Count([1,3,4,5,2,1],1)
print(ans1)