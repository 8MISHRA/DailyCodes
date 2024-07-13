# Question: Given an array of integers, write a function to find the length of the longest contiguous subarray with a sum equal to 0.

def max_len_zero_sum_subarray(arr):
    # HashMap to store (sum, index)
    hash_map = {}
    max_len = 0
    curr_sum = 0

    for i in range(len(arr)):
        curr_sum += arr[i]

        if curr_sum == 0:
            max_len = i + 1

        if curr_sum in hash_map:
            max_len = max(max_len, i - hash_map[curr_sum])
        else:
            hash_map[curr_sum] = i

    return max_len

# testing
arr = [1, 2, -3, 1, 2, -3]
print(max_len_zero_sum_subarray(arr))  # Output: 6

# Time_comp: O(n)
# Space_Comp: O(n)
