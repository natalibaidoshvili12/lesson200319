import random
import timeit

def countingSort(arr, exp1): 
    arr2 = [0] * (len(arr)) 
    place = [0] * (10) 
    for i in range(0, len(arr)): 
        index = (arr[i]//exp1) 
        place[ (index)%10 ] += 1
    for i in range(1,10): 
        place[i] += place[i-1] 

    i = len(arr)-1
    while i>=0: 
        index = (arr[i]//exp1) 
        arr2[ place[ (index)%10 ] - 1] = arr[i] 
        place[(index)%10] -= 1
        i -= 1
    i = 0
    for i in range(0,len(arr)): 
        arr[i] = arr2[i] 

def radixSort(arr): 
    max1 = max(arr) 
    exp = 1
    while max1/exp > 0: 
        countingSort(arr,exp) 
        exp *= 10
arr=[0]*(1000000)
for i in range (1000000) :
    arr[i]=random.randint(0,300)
start = timeit.default_timer()
radixSort(arr) 
end = timeit.default_timer()
print('Runtime is: ', end-start)

 
  