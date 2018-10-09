/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.asdfadf
 */
package tempconvert;

/**
 *
 * @author Jonathan
 */
import java.util.Scanner;

public class TempConvert 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        double tempC, tempF;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter temperature in Celsius to be converted to Fahrenheit: ");
        tempC = keyboard.nextDouble();
        
        tempF = (9.0/5.0) * tempC + 32.0;
        System.out.println("The temperature is " + tempF + " Fahrenheit!");
    }
    
}
