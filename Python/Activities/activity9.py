first_list=[1,2,3,4,5]
sec_list=[6,7,8,9,10]
new_list=[]
for i in first_list:
    if(i%2!=0):
        new_list.append(i)

for i in sec_list:
    if(i%2==0):
        new_list.append(i)

print(new_list)
         

