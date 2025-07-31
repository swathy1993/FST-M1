
def calsum(num) :
        if num:
            sum=num+calsum(num-1)
            return sum
        else :
            return 0
    

print (calsum(10))

