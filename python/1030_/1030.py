n_casos = int(input())

for caso in range(n_casos):
  n, k = map(int,input().split())
  lista = list(range(1,n+1))

  while len(lista) > 1:
    lista = lista[::k]
    print(lista)

print(lista)



