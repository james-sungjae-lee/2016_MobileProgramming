package mobileProgramming;

import java.util.Scanner;

public class binarySearching {

	public static void main(String[] args) {
		
		
        int[] data = { 1, 2, 4, 5, 7, 8, 9 };
        System.out.print("������ Ž�� :");
       
        Scanner scn = new Scanner(System.in);
        int search = scn.nextInt();
       
        boolean flag = false;
        int index = -1; 
               
        for(int i=0; i<data.length;i++){
            if(data[i] == search){
                flag = true; 
                index = i; 
            }          
        }      
        
        if(flag){
            System.out.println(search+"�� "+(index+1)+ "��°���� ã��");
        }else{
            System.out.println("ã�� ����");
        }      
    }

		// TODO Auto-generated method stub

	}
