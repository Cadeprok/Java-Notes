def quick_sort(values):
    if len(values) <= 1:
        return values 
    pivot= values[0]
    greater = []
    lesser = []
    for value in values[1:]:
        if value > pivot:
            greater.append(value)
        else:
            lesser.append(value)
    return quick_sort(lesser) + [pivot] + quick_sort(greater)

def merge_sort(values):
    if len(values) <= 1:
        return values
    sorted = []
    left_index = 0
    right_index = 0
    midpoint = len(values) // 2
    right_side = merge_sort(values[midpoint:])
    left_side=merge_sort(values[:midpoint])
    while left_index < len(left_side) and right_index < len(right_side):
        if left_side[left_index] < right_side[right_index]:
            sorted.append(left_side[left_index])
            left_index +=1
        else:
            sorted.append(right_side[right_index])
            right_index +=1
    return sorted

def bubble_sort(values):
    length = len(values)
    swapped = False
    for i in range(length-1):
        for j in range(0,length-i-1):
            if values[j] > values[j+1]:
                swapped = True
                values[j], values[j+1] = values[j+1], values[j]
    if not swapped:
        return            
    



def merge_sort2(values):
    if len(values) <= 1:
        return values 
    midpoint = len(values) // 2
    right_index = 0
    left_index = 0
    sorted = []
    right_side = merge_sort2(values[midpoint:])
    left_side = merge_sort2(values[:midpoint])

    while right_index < len(right_side) and left_index < len(left_side):
        if left_side[left_index] < right_side[right_index]:
            sorted.append(left_side[left_index])
            left_index +=1
        else:
            sorted.append(right_side[right_index])
            right_index +=1
    return sorted

def quick_sort2(values):
    pivot = values[0]
    less_than = []
    greater_than = []
    for i in range(values[1:]):
        if values[i] > pivot:
            greater_than.append(values[i])
        else:
            less_than.append(values[i])
    return quick_sort2(less_than) + [pivot] + quick_sort2(greater_than)