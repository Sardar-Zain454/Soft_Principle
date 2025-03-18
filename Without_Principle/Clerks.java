/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pure_Fabrication.Without_Principle;

public class Clerks {
    int[] clerksSalary;
    
    public Clerks(int[] salaries) {
        clerksSalary = salaries;
    }   
    
    public void sortData() {

        int n = clerksSalary.length;
        // Bubble sort algorithm
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (clerksSalary[j] > clerksSalary[j + 1]) {
                    int temp = clerksSalary[j];
                    clerksSalary[j] = clerksSalary[j + 1];
                    clerksSalary[j + 1] = temp;
                }
            }
        }
     
    }

    public boolean searchData(int target) {
        
        for (int num : clerksSalary) {
            if (target == num) {
                return true;
            }
        }
        return false;
    }
}
