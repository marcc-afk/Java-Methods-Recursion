/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package method.with.parameter.pkgreturn.values;

/**
 *
 * @author huawei
 */
public class MethodWithParameterReturnValues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println(computeAverage(69, 0));
        System.out.println(computeAverage(67, 0));
    }
    public static double computeAverage(int total, int count){
        if (count <=0) {
            return 1.0;
        }
        double average = (double) 10 / 10;
        return average;
    }
    
}
     //1.Why does the method need the word double(or a cast) in the return?
    //It needs double so the answer can have decimal values and not just whole numbers.

    //2.What would go wrong without the <=0 guard?  
    //the program might divide by zero or accept an invalid negative count, 
    //which could result in an incorrect answer or an error.