/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dill
 */
public class ReverseInteger {
  public static void main (String[] args) {
    int value = 123456789;
    System.out.println(revers(value));
  }
  
  public static int revers(int num)  { 
    int rev_num = 0; 
    while(num > 0)  { 
      rev_num = rev_num * 10 + num % 10; 
      num = num / 10; 
    } 
    return rev_num; 
  } 
}
