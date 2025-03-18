/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pure_Fabrication.Without_Principle;

/**
 *
 * @author Global Computer ATD
 */
public class Managers {
    int[] managersSalary;
    
    public Managers(int[] salaries) {
        managersSalary = salaries;
    }
    
             public void sortData() {

        int n = managersSalary.length;
        // Bubble sort algorithm
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (managersSalary[j] > managersSalary[j + 1]) {
                    int temp = managersSalary[j];
                    managersSalary[j] = managersSalary[j + 1];
                    managersSalary[j + 1] = temp;
                }
            }
        }
    }

    public boolean searchData(int target) {
        
        for (int num : managersSalary) {
            if (target == num) {
                return true;
            }
        }
        return false;
        
    }
    
    
}
