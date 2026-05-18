#Capture information of 2 users. This information includes their name, age and height (in cm).
#Display each users information in a sentence format.
#Then calculate and display the total combined height of both users.

print('====User 1 details======')
user1_name = input('Enter user1 name: ')
user1_age = int(input('Enter your age: '))
user1_height = float(input('Enter your height(cm): '))
print(f'Your name is {user1_name} and you are {user1_age} old. Your height is {user1_height} cm' )

print()

print('====User 2 details======')
user2_name = input('Enter user2 name: ')
user2_age = int(input('Enter your age: '))
user2_height = float(input('Enter your height(cm): '))
print(f'Your name is {user2_name} and you are {user2_age} old. Your height is {user2_height} cm' )


total_height = user1_height + user2_height
print()
print('====Total combined Height======')
print(f'The total combined height of both users is {total_height} cm')