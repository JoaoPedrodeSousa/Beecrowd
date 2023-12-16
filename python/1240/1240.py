entrada = int(input())
lista = []


for _ in range(entrada):
    valor1, valor2 = input().split()
    
    if valor1.endswith(valor2):
        lista.append("encaixa")
    else:
        lista.append("nao encaixa")
        
        
for i in lista:
    print(i)