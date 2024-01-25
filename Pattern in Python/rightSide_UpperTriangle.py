def pattern(num):
    for rows in range(0,num):
        for space in range(0,rows):
            print(" ",end = " ")
        for column in range(num-rows):
            print("*",end=" ")
        print()
            
rows = int(input("Enter Number of Rows:"))
pattern(rows)