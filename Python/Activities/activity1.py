name=input("What's you'r name?").lower()
age=int(input("enter your age:")) #take user name and age
# when user turn 100
user_age100_year=2025+(100-age)

print(user_age100_year)
print(name+" will turn 100 when "+str(user_age100_year))
print(name+" will turn 100 when {} ".format(user_age100_year))