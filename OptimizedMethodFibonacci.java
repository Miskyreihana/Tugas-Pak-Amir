/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optimizedmethodfibonacci;

/**
 *
 * @author Misky Reihana A
 */
public class OptimizedMethodFibonacci {

    static int fib(int n) 
    { 
        int a = 0, b = 1, c; 
        if (n == 0) 
            return a; 
        for (int i = 2; i <= n; i++) 
        { 
            c = a + b; 
            a = b; 
            b = c; 
        } 
        return b; 
    } 
  
    public static void main (String args[]) 
    { 
        int n = 9; 
        System.out.println(fib(n)); 
    } 
} 