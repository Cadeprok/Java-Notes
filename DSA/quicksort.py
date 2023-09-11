import sys
from load import load_numbers

numbers= load_numbers(sys.argv[1])

def quick_sort(values):
    if len(values <= 1): # If list only has one or zero numbers in it, then it doesnt need to be sorted because it already is
        return values
    
    less_than_pivot = []
    greater_than_pivot = []
    pivot = values[0]
    for value in  values[1:]: 
        if values <= pivot:
            less_than_pivot.append(value)
        else:
            greater_than_pivot.append(value)
    return quick_sort(less_than_pivot) + [pivot] + quick_sort(greater_than_pivot) 


sorted_numbers = quick_sort(numbers)
print(sorted_numbers)