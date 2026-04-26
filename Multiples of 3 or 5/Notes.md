## 	Multiples of 3 or 5
Problem: https://projecteuler.net/problem=1

- We have to find the sum of multiples of 3
- We have to find the sum of multiples of 5
- We have to subtract the multiples that are common for both because they will be added twice, so all multiples of 15 subtract
- In other words, add to sum if that number is divided by either 3 or 5  -->
	
	```
	i goes from 0 till N - 1
		if i % 3 == 0 or i % 5 == 0 
		then ans += i;
    ```