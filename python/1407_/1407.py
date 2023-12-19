sorteios, numeros_por_aposta,valor_maximo_aposta = map(int, input().split())

# if numero_sorteios == numeros_por_aposta and numeros_por_aposta == valor_maximo_aposta and valor_maximo_aposta == 0:
#   break

dicio = {}
for i in range(1, valor_maximo_aposta + 1):
  dicio[i] = 0

print(dicio)

lista_resultados = []

for sorteio in range(sorteios):
  lista = list(map(int,input().split()))

  print(lista)

  for i in lista:
    dicio[i] += 1
  

def get(dicionario:dict):
  ...

min_dict = min(dicio.values())
resultado = list(filter(get, dicio))
print(dicio)








