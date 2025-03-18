/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pure_Fabrication.Without_Principle;

//        int[] employeesSalary = {5000, 30000, 80000, 10000, 2000};
//        int[] clerksSalary = {50000, 3000, 80000, 10000, 20000};
//        int[] managersSalary = {5000, 3000, 8000, 10000, 20000};


public class Employees {
    int[] employeesSalary;
    
    public Employees(int[] salaries) {
            employeesSalary = salaries;
    } 
    
      public void sortData() {

        int n = employeesSalary.length;
        // Bubble sort algorithm
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (employeesSalary[j] > employeesSalary[j + 1]) {
                    int temp = employeesSalary[j];
                    employeesSalary[j] = employeesSalary[j + 1];
                    employeesSalary[j + 1] = temp;
                }
            }
        }
     
    }

    public boolean searchData(int target) {
        
        for (int num : employeesSalary) {
            if (target == num) {
                return true;
            }
        }
        return false;
    }
}
