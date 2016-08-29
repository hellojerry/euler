
not_found = True
step = 20
divisors = list(range(11,21))

def check_factors(numer):
	res = []
	for i in divisors:
		if numer % i == 0:
			res.append(True)
		else:
			res.append(False)
			break
	return res

while not_found == True:
	step += 20
	print(step)
	checked = check_factors(step)
	if all(q for q in checked) == True:
		print(step)
		not_found = False
		
print(res)
