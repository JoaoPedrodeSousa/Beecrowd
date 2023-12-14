# -*- coding: utf-8 -*-

length = int(input())
lista = []
count = 0;


for i in range(length):
    var = input()
    
    while "  " in var:
        var = var.replace("  "," ")
    
    lista.append(var)

max_length = len(max(lista))

for item in lista:
    item_length = len(item)
    spaces = max_length - item_length
    print(" " * spaces + item)
