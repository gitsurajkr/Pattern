def UpperTriangle(num):
    for row in range(0,num):
        for space in range(row):
            print(" ",end = " ")
        for column in range (0,2*(num-row)-1):
          print("*",end = " ")
        print()

rows = int(input("Enter NUmber of Rows: "))
UpperTriangle(rows)