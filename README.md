# This repository is the solution for the backend code challenge

#  Ideas:
 ## First idea:
 The brute force approach is to loop through all elements of the array and for each one of them
 loop through all characters and check if it is in the string or not.
 This process is `O(m*n^2)` where m is the length of the input array,
 so it is not good.


 ## Second idea:
 We can loop through all elements of the array and for each one of them, we can sort the strings and compare them, if they are the same, return true
 but downside of it is the time complexity of a good sorting algorithm is `O(m*nlogn)` where m is the length of the input array.


 ## Third idea:
 We can loop through all elements of the array and for each one of them, we can count how many characters from `a-z` is in the strings.
 if the count is the same, we find a match.
 We can use a hashMap or array to store the count of each character. In this case, we don't hashCode, so I just use an array.
 the time complexity is `O(m*n)` where m is the length of the input array and n is the length of the string.
 and Space complexity is `O(size of charCount array)`;
 
## Solution:
 **There is a trade-off between time and space complexity, I solve the problem with the third idea.**
     
##  Assumptions:
 - Strings consist of lowercase English letters from `a-z`, so there are 26 different characters.
 - Exact same character and the same quantity of each character.
 - Repeated character in target is allowed.
     

## Used Stack 

   * Java 11
   * maven
   * Junit5
  
### Build Project

Clone the project and execute below commend

```
mvn clean install
```
To run the test cases, you can run the test cases in the project or execute below commend

```
mvn test
```
###### By: Milad Ranjbari
