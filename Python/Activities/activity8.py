numList=list(input("enter a list of numbers seperated by coma:").split(','))
#n=len(numList) can used to get length and n-1 as last index
if(numList[-1]==numList[0]):
    print("true")
else:
    print("false")