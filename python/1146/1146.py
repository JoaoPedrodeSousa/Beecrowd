text =""
while True:
  value = int(input())
  
  if value == 0:
    break
  
  text += ' '.join(map(str, range(1, value + 1))) + '\n'

print(text.strip())