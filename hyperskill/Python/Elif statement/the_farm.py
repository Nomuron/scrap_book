money = int(input())
amount = 0

if money >= 6769:
    amount = money // 6769
    print(amount, "sheep")
elif 6769 > money >= 3848:
    print("1 cow")
elif 3848 > money >= 1296:
    amount = money // 1296
    if amount > 1:
        print(amount, "pigs")
    else:
        print("1 pig")
elif 1296 > money >= 678:
    print("1 goat")
elif 678 > money >= 23:
    amount = money // 23
    if amount > 1:
        print(amount, "chickens")
    else:
        print("1 chicken")
else:
    print("None")
