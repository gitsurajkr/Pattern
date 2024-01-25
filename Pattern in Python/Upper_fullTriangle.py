def UpperTriangle(num):
    for row in range(0,num):
        for space in range(0,num-row):
            print(" ",end = " ")
        for column in range (0,2*row+1):
          print("*",end = " ")
        print()

rows = int(input("Enter NUmber of Rows: "))
UpperTriangle(rows)