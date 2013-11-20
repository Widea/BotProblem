import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
/* Head ends here */
static void displayPathtoPrincess(int n, String [] grid)
{
    int size = n*n;
int ppos_i = 0;
int mpos_i = 0;
int ppos_j = 0;
int mpos_j = 0;

char [][]final; 
target = new char[n][]; 
for(int i=0;i<n;i++) 
target[i] = grid[i].toCharArray();     
    
    
for(int i = 0; i < n; i++)
{
   // System.out.println();
    for(int j = 0; j<n; j++)
{  
    //System.out.print(target[i][j]);
    
    if (final[i][j] == 'p')  
    {ppos_i = i; ppos_j = j;}
    
    if (final[i][j] == 'm')
      {mpos_i = i; mpos_j = j;}   
    
}
}
    
 /*ppos_i = ppos/n;
 ppos_j = ppos%n;
 mpos_i = mpos/n;
 mpos_i = mpos%n;
 */
 
 
    
    while(ppos_i != mpos_i) 
    {    
     /*System.out.print(ppos_i);
     System.out.print(ppos_j); 
     System.out.println();   
     System.out.print(mpos_i);
     System.out.print(mpos_j); */  
    
    if (mpos_i < ppos_i )
    {  
        System.out.println("DOWN");
        
        mpos_i = mpos_i + 1;
    }
    else 
    { 
       System.out.println("UP");
      
       mpos_i= mpos_i - 1;
      // System.out.println( mpos_j);
    }
    }          
    
    while(ppos_j != mpos_j)
    {
          
      if(mpos_j < ppos_j)
    {    System.out.println("RIGHT");
         
         mpos_j++;
    }
     else
     {
         System.out.println("LEFT");
         
          mpos_j--;
     }
        
    }  
    
        
        }
    
/* Tail starts here */
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m;
        m = in.nextInt();
        String grid[] = new String[m];
        for(int i = 0; i < m; i++) {
            grid[i] = in.next();
        }

    displayPathtoPrincess(m,grid);
    }
}
