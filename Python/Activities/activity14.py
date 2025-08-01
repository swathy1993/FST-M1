def fibinacci(n):
    if(n<=1):
        return n
    else:
         return(fibinacci(n-1)+fibinacci(n-2))
	
	
nterms = int(input("Enter a number: "))
if nterms <= 0:
    print("Please enter a positive number")
else:
    print("Fibonacci Sequence: ")
    for i in range(nterms):
        print(fibinacci(i))
        