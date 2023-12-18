casos = int(input())
lista = []
for caso in range(casos):
  qtd = float(input())
  dia = 0
  while qtd > 1:
    qtd /= 2
    dia += 1
  
  lista.append(str(dia) + " dias")

for i in range(casos):
  print(lista[i])