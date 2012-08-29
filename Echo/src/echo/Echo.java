/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package echo;

/**
 *
 * @author Chris
 */
public class Echo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      for(int i = 0; i<args.length;i++)
      {
          System.out.println(args[i]);
      }
    }
}
