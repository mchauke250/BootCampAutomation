numbers = [10, 20, 30,40,50]
# numbers = [10, 20, 'string']  # Bad programming practise
# index starts at 0

print(numbers)
print(type(numbers))

print(type(numbers[0]))
# print(type(10))

print()

# Access index 0
print(numbers[0])
print(numbers[1])
print(numbers[100])   # IndexError
