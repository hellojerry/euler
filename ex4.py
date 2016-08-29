def is_palindrome(val):
	if str(val)[::-1] == str(val):
		return True
	return False

max_palindrome = 0
for i in range(100,999):
	for j in range(100,999):
		prod = i*j
		if is_palindrome(prod) and prod > max_palindrome:
			max_palindrome = prod
print(max_palindrome)
