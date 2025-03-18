/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pure_Fabrication.With_Principle;



public class DataProcessor {
    
    public int[] sortData(int[] data) {
        
        
        int n = data.length;
        // Bubble sort algorithm
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        return data;
    }


    public boolean searchData(int[] data, int target) {
     
        for (int num : data) {
            if (target == num) {
                return true;
            }
        }
        return false;
    }
    
}

