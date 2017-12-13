/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsupplier;

/**
 *
 * @author User
 */
public class SetArrayLength {
    
    public int array_length;
    public String [] isiArray;
    
    public void setLength(int length){
        array_length = length;
    }
    
    public void setArrayContent(String [] arrayContent){
        isiArray = arrayContent;
    }
    
    public String [] getArrayContent(){
        return isiArray;
    }
    
    public int getLength(){
        return array_length;
    }
}
