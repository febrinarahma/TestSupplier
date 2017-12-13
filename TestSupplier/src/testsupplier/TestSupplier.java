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
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;


public class TestSupplier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        SetArrayLength arrayLength =  new SetArrayLength();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        String pilihan;
        int angka;  
        int i;
        int j = 0;
        int index;
        try
            {
                System.out.println("List of Commands"); 
                System.out.println("1. Create");
                System.out.println("2. Insert");
                System.out.println("3. Min");
                System.out.println("4. Max");
                System.out.println("5. Delete");
                System.out.println("6. Show");
               while (j<1){
		System.out.print("Insert command here: "); 
		pilihan = (input.readLine());
                   
                switch(pilihan){
				
                    case "Create":
                        System.out.print("Insert long array: "); 
                        angka = Integer.parseInt(input.readLine());
			System.out.println("Created " + angka + " spaces for suppliers");
                        arrayLength.setLength(angka);
                        System.out.print("Do you want to continue process (0 for yes/ 1 for no) : "); 
                           j = Integer.parseInt(input.readLine());
                            if(j == 0){
                                continue;
                                }
                            else{
                               break;
                            }
                     		
                    case "Insert":
                       
                    List<String> suppliers = new ArrayList<String>();
                    int iteration = arrayLength.getLength();
                    for(i=0;i<iteration;i++){
                        System.out.print("Insert Data Supplier " +(i+1) + ":");
                        suppliers.add(input.readLine());
                    
                    }
                    String [] content = suppliers.toArray(new String[suppliers.size()]);
                    arrayLength.setArrayContent(content);
                    System.out.print("Do you want to continue process (0 for yes/ 1 for no) : "); 
                            j = Integer.parseInt(input.readLine());
                            if(j == 0){
                                continue;
                                }
                            else{
                               break;
                            }
		case "Show":
                       String [] tampil = arrayLength.getArrayContent();
                       System.out.println(Arrays.toString(tampil));
                        System.out.print("Do you want to continue process (0 for yes/ 1 for no) : "); 
                            j = Integer.parseInt(input.readLine());
                            if(j == 0){
                                continue;
                                }
                            else{
                               break;
                            }
                 case "Min":
                       String [] minimum = arrayLength.getArrayContent();
                       ArrayList list = new ArrayList<String>(Arrays.asList(minimum));
                       Object obj = Collections.min(list);
                       System.out.println("Minimum Value: " + obj );
                       System.out.print("Do you want to continue process (0 for yes/ 1 for no) : "); 
                            j = Integer.parseInt(input.readLine());
                            if(j == 0){
                                continue;
                                }
                            else{
                               break;
                            }
                      case "Max":
                       String [] maximum = arrayLength.getArrayContent();
                       ArrayList listMax = new ArrayList<String>(Arrays.asList(maximum));
                       Object objMax = Collections.max(listMax);
                       System.out.println("Maximum Value: " + objMax );
                         System.out.print("Do you want to continue process (0 for yes/ 1 for no) : "); 
                            j = Integer.parseInt(input.readLine());
                            if(j == 0){
                                continue;
                                }
                            else{
                               break;
                            }
                            
                       case "Delete":
                       String [] deleteList = arrayLength.getArrayContent();
                       ArrayList deleteElement = new ArrayList<String>(Arrays.asList(deleteList));
                       System.out.print("Insert index element that will be deleted: "); 
                       index = Integer.parseInt(input.readLine());
                       deleteElement.remove(index);
                       
                       String [] deletedList = (String[]) deleteElement.toArray(new String[deleteElement.size()]);
                        arrayLength.setArrayContent(deletedList);
                       System.out.println("Element array " + index + " deleted");
                        System.out.print("Do you want to continue process (0 for yes/ 1 for no) : "); 
                            j = Integer.parseInt(input.readLine());
                            if(j == 0){
                                continue;
                                }
                            else{
                               break;
                            }
                    default:
                          System.out.println("Your argument is wrong, please input correct argument");
			} 
                    
               
                }       
            }
            catch(IOException eox) // menangkap kesalahan
            {
            System.out.println(eox);
            }
    }
    
}
