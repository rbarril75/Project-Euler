sum = 0

for i in range(1, 334):
	i = i * 3
	if i % 15 != 0:
		sum += i
		
for i in range(1, 200):
	sum += i * 5

print sum