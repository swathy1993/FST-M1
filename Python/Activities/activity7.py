#numList=[10,20,30,40,50,60,70,80,90,10,20]
numList=list(input("enter a list of numbers seperated by coma:").split(','))
sum=0
#calculate the sum f all the numbers
for item in numList:
            sum+=int(item)
print ("the sum of the list is:",sum)