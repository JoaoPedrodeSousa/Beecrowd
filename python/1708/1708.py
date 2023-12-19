mais_rapido, mais_lento = map(int,input().split())

voltas_mais_rapido = mais_rapido 
voltas_mais_lento = mais_lento
count = 1

while(voltas_mais_lento - voltas_mais_rapido < mais_lento):
    voltas_mais_rapido += mais_rapido
    voltas_mais_lento += mais_lento
    count += 1
    

print(count)