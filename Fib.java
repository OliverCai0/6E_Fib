/** 
  Calculate Fibonacci number n
  3 implementations
  @precondition: n >= 1
  
  Use type "long" instead of "int", because rabbits.

  I found that the highest index for question 5 on the homework
  was 40. Anything larger seemed to give the terminal trouble.
 */

public class Fib {
    /** 
      @return the nth Fibonacci number
              by implementing the recurrence relation
     */
    /**
     * Binary Decision: Are you trying to find the 1st or 2nd term or 
     * any other term?
     * Solution to Base Case: If you are trying to find 
     * the 1st or 2nd term, return 1
     * Solution to the Recursive Case: 
     * -Recursive Abstraction: When I asked to find the nth term
     * of the fibonacci sequence, the recursive abstraction can find
     * the n-1th and n-2th terms of the fibonacci sequence using the same
     * instructions
     * -Combining Element + Additional Processing: Addition 
     * of the two returned terms
     */
    public static long fib_recurrence( int n) {
      if(n == 1 || n == 2){
        return 1;
      } 
      else{
        return fib_recurrence(n - 1) + fib_recurrence(n - 2);
      } 
      //return -2; // invalid Fibonacci number
    }
     /* These are class methods because...
     the method is same across all instances of the Fib class
     and it does not alter the value of any fields introduced
    */


    /** 
      @return the nth Fibonacci number
              calculated via the 8th-grade algorithm
     */
    public static long fib_grade8( int n) {
      int f2 = 1;
      int f1 = 1;
      while(n > 2){
        int tempHold = f1;
        f1 = f2;
        f2 = f2 + tempHold;
        n--;
      }
      return f2;
        //return -2; // invalid Fibonacci number
    }
    /* Time complexity:
       Consider the size of the problem to be ...
       
       As the proxy for the time required, count...
       
       Then cost of the the grade8 algorithm
       grows linearly 
       as the size of the problem increases,
       because the number of loops in fib_grade8 is equal to
       value of the term sought.
     */


    /** 
      @return the nth Fibonacci number
              calculated via Binet's formula.
              Type is double so that this exercise can
              ignore rounding issues.
     */
    public static double fib_Binet( int n) {
      double phi = (1 - Math.sqrt(5)) / 2;
      double psi =  1 - goldenRatio;
      return(Math.pow(phi, n) - Math.pow(psi, n)) / phi - psi;
        //return -2; // invalid Fibonacci number
    }
    /* Time complexity:
       Consider the size of the problem to be ...
       
       As the proxy for the time required, count...
       
       Then cost of the the Binet algorithm does not
       grows  
       as the size of the problem increases,
       because the only computation is a constant calculation
     */
}
