maior_numero = 0

while True:
    numero_usuario = int(input())
    
    if numero_usuario == 0:
        break
    
    if numero_usuario > maior_numero:
        maior_numero = numero_usuario
        
print(maior_numero)    

