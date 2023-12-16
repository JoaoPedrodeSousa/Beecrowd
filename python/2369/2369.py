tarifa = 7
metro_cubico = 0

metro_consumido_usuario = int(input())

#Para cada acrescimo de Tarifa, devera ser somado com o valor maximo da(s) tarifa(s) anterior(es). 
# 11 a 30 -> valor maximo = 20
# 31 a 100 -> valor maximo = 140

if metro_consumido_usuario >= 11 and metro_consumido_usuario <= 30:
    metro_cubico = metro_consumido_usuario - 10

elif metro_consumido_usuario >= 31 and metro_consumido_usuario <= 100:
    metro_cubico = ((metro_consumido_usuario - 30) * 2) + 20

elif metro_consumido_usuario >= 101:
    metro_cubico += ((metro_consumido_usuario - 100) * 5) + 140 + 20

tarifa += metro_cubico

print(tarifa)
