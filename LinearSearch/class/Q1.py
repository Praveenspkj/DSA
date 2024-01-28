
# input=[1,2,3,3,4,5,2]
# t=2
# o/p
# [1,6]
# t=3
# o/p
# [2,3]
# t=9
# o/p
# [0,0]

def Count(arr,t):
    ans=[]
    for i in range(len(arr)):
        if arr[i]==t:
            ans.append(i)
    return ans        

ans1=Count([1,2,3,3,4,5,2],2)
print(ans1)