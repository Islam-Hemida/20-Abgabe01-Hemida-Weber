# Software Configuration Management #

Assignment 01: Test Automation with JUnit

- Bachelor program MSD FH - Joanneum.


Team
=====
- [Islam Hemida][islam1992]
- [Lukas Weber][iamLukWeb]


Steps for mastering this exercise 
=====

- Create subclass Cocktail
- Creater subclass ShakenOrStirred
- JUnit Test for SimpleDrink
- Junit Test for Cocktail
- Junit Test for Exception
- Create final report

Plan for Subclass Cocktail
=====

The method in the first subclass will chek if you have drink too much alcohol. 

##Plan for the Second subclass 

The second subclass will chek if customer would habe his drink shaken or stirred

Junit Tests
=====

- Testing subclass Cocktail. 
- Try to test isAlkoholic. 

Code Snippet for Subclass Cocktail
=====

If the customer drink more than 2 Cocktails then he have drink to much alcohol

```Java 
public static void toMuchAlkohol(int volume) {
        if (volume >= 2) {
            System.out.println("Don't drink nothing more this day");
        }
 ```



[islam1992]: https://github.com/Islam1992
[iamLukWeb]: https://github.com/iamWebLuk
