mais_rapido, mais_lento = map(int,input().split())

voltas_mais_rapido = mais_rapido 
voltas_mais_lento = mais_lento
count = 0

while(True):
    if(voltas_mais_lento - voltas_mais_rapido >= mais_lento):
        count += 1
        
        break
    
      
    voltas_mais_rapido += mais_rapido
    voltas_mais_lento += mais_lento
    count += 1
    

print(count)