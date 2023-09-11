numbers = [1,5,7,2,1,6,7,8]
def merge_sort(values):
    if len(values) <= 1:
        return values
    left_index = 0
    right_index = 0
    sorted = []
    midpoint = len(values) // 2
    left_values = merge_sort(values[:midpoint])
    right_values = merge_sort(values[midpoint:])
    while left_index < len(left_values) and right_index < len(right_values):
        if left_values[left_index] < right_values[right_index]:
            sorted.append(left_values[left_index])
            left_index += 1
        else:
            sorted.append(right_values[right_index])
            right_index+= 1
    sorted += left_values[left_index:]
    sorted+= right_values[right_index:]
    return sorted 


print(merge_sort(numbers))