import re

f = open("Windows_2k.log" , "r")
lines = f.readlines()

elso=0
masodik=0
harmadik=0
negyedik=0
otodik=0
count=0
for line in lines:
    count += 1
    print(f'line {count}: {line}')
    x = re.search("^2016-09-29", line)
    if x:
        elso +=1
    y = re.search("]$", line)
    if y:
        masodik += 1
    z = re.search("C.S", line)
    if z:
        harmadik +=1
    v = re.search("attribute", line)
    if v:
        negyedik +=1
    w = re.search("y+", line)
    if w:
        otodik +=1


print("Ennyi sor kezdődik 2016-09-29-el: ")
print(elso)
print("Ennyi sor végződik szögletes zárójelre: ")
print(masodik)
print("Ennyi sor tartalmazza a 'C' 'bármilyen karakter' 'S' kifejezést: ")
print(harmadik)
print("Ennyi sor tartalmazza az 'attribute' kifejezést: ")
print(negyedik)
print("Ennyi sor tartalmazlegalább egy y betüt: ")
print(otodik)


