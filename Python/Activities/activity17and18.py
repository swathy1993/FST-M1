import pandas as pd
#variables->small letter_,methods same,class start with capsSnake case naming convention:
#variables -> var_name
#methods -> method_name
#classes -> Class_Name
data={
    "username":["admin","madhav","sree"],
    "password":["pass","ma123","wetiu"]
}
df=pd.DataFrame(data) #convert to dta frame
df.to_csv("sample.csv",index=False)#write to file

 #activty18
input_data=pd.read_csv("./sample.csv")

#print values  only in user name 
print("only user name")
print(input_data["username"])
print("only sec raw")
print(input_data["username"][1],input_data["password"][1])
print("sorted the user name order")
print(input_data.sort_values(by="username",ascending=True))
print("sorted the password order")
print(input_data.sort_values(by="password",ascending=False))




