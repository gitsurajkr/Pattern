def pattern(num):
    for rows in range(0,num):
        for column in range(0,rows+1):
            print("*",end = " ")
        print()
            
rows = int(input("Enter Number of Rows:"))
pattern(rows)