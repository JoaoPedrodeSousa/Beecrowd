casos = int(input())
lista = []
for caso in range(casos):
    text = ""

    minimo, maximo = map(int, input().split())

    for i in range(minimo, maximo+1):
        text += str(i)

    text += text[::-1]

    lista.append(text)

for i in lista:
    print(i)