def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

def lcm(a, b):
    return abs(a * b) // gcd(a, b)

def LCM(arr):
    result = arr[0]
    for num in arr[1:]:
        result = lcm(result, num)
    return result

arr = [12, 15, 20]
print("LCM ", LCM(arr))

