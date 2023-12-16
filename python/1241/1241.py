# -*- coding: utf-8 -*-

length = int(input())
a = ""
b = ""

while length:
    try:
        a = input()
        b = input()
    except EOFError:
        break
    
    init = len(a) - len(b)
    
    if b in a[init:]:
        print("encaixa")
    else:
        print("nao encaixa")
    
    length -= 1

