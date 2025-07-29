while True:
    user1=input("enter user1 input").lower()
    user2=input("enter user2 input").lower()
    if ((user1=="stone") and (user2=="scissors")) or ((user1=="paper") and (user2=="stone")) or((user1=="scissors") and (user2=="paper") ):
        print(user1+"wins the game" )
    elif((user2=="stone") and (user1=="scissors")) or ((user2=="paper") and (user1=="stone")) or((user2=="scissors") and (user1=="paper") ):
        print(user2+"wins the game" )
    else:
        print("tie")

    option=input("do you want to paly again").lower()
            
    if(option!="yes"):
        break