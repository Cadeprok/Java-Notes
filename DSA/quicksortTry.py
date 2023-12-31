def quick_sort(values):
    if len(values) <= 1:
        return values
    
    less_than_pivot =[]
    greater_than_pivot=[]
    pivot = values[0]

    for value in values[1:]:
        if value > pivot:
            greater_than_pivot.append(value)
        else:
            less_than_pivot.append(value)
    
    return quick_sort(less_than_pivot) + [pivot] + quick_sort(greater_than_pivot)