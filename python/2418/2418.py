def calcular_nota_final(notas):
    notas.sort()
    nota_final = sum(notas[1:4])

    return round(nota_final, 1)

notas = list(map(float, input().split()))

resultado = calcular_nota_final(notas)
print(resultado)
