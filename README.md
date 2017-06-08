# CalculateTest
Learn JUnit

if the calling happens in the class CalculateTest:
"
  Calculate calculation = new Calculate();
	int sum = calculation.sum(2,5);
	int testSum = 7;
	
	int subtract = calculation.subtract(10, 9);
	int testSubtract = 1;
"

the result of the test is :
"
  sum =2+5
  subtract = 10-9

  @Test sum: 7=7
  sum =2+5
  subtract = 10-9

  @Test subtract:1=1
"

It is clear that the quoted block runs twice, which means when the functions annotated by @Test is called, the class 
including those functions is initialized again.
