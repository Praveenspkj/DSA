# 1.

# input=[1,4,1,5,3,4]

# t=1

# o/p—>2

# t=4

# 0/p—>8

# t=5

# o/p—>5

def Count(arr,t):
    ans=0
    for i in range(len(arr)):
        if arr[i]==t:
            ans=ans+arr[i]
    return ans        

ans1=Count([1,4,1,5,3,4],4)
print(ans1)