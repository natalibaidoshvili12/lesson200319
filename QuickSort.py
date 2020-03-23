import random
import timeit
def divide(arr,low,high): 
    for j in range(low , high): 
        if   arr[j] < arr[high]: 
            low+=1 
            arr[low-1],arr[j] = arr[j],arr[low-1] 
  
    arr[low],arr[high] = arr[high],arr[low] 
    return ( low ) 

def quickSort(arr,low,high): 
    if low < high: 
        middle = partition(arr,low,high) 
        quickSort(arr, low, middle-1) 
        quickSort(arr, middle+1, high) 
        
arr = []*(1000000)
for i in range(len(arr)) :
    arr[i]=random.randint(0,300)
start = timeit.default_timer()
quickSort(arr,0,len(arr)-1) 
end = timeit.default_timer()
print('Runtime is: ',end-start)