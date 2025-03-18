

package Pure_Fabrication.With_Principle;

public class Main {

    public static void main(String[] args) {
      
        DataProcessor processData = new DataProcessor();
        
        // Data from each class is handled by only one artificial class called Data Processor class
        int[] employeesSalary = {5000, 30000, 80000, 10000, 2000};
        int[] clerksSalary = {50000, 3000, 80000, 10000, 20000};
        int[] managersSalary = {5000, 3000, 8000, 10000, 20000};
        
        System.out.println("\tEmployees salary before sorting");
          for(int sal : employeesSalary) {
              System.out.print(sal);
          }
          
       System.out.println("\tEmployees salary after sorting");
        int[] sortedEmployeeSalary = processData.sortData(employeesSalary);
        
        
        
        System.out.println("\tClerks salary before sorting");
           for(int sal : clerksSalary) {
              System.out.print(sal);
          }
        
        System.out.println("\tClerks salary after sorting");
        int[] sortedClerksSalary = processData.sortData(clerksSalary);
        
        
        System.out.println("\tManagers salary before sorting");
           for(int sal : managersSalary) {
              System.out.print(sal);
          }
           
        System.out.println("\tManagers salary after sorting");
        int[] sortedManagersSalary = processData.sortData(managersSalary);
        
        
        int target = 30000;
        
        
        // Searching for employee salary.
        if(processData.searchData(employeesSalary, target)) {
            System.out.println("Salary with value " + target + " is not present in our database");
        } else {
             System.out.println("Salary with value " + target + " is  present in our database");
        }
        
         // Searching for employee salary.
        if(processData.searchData(clerksSalary, target)) {
            System.out.println("Salary with value " + target + " is not present in our database");
        } else {
           System.out.println("Salary with value " + target + " is present in our database");
        }
        
         // Searching for employee salary.
        if(processData.searchData(managersSalary, target)) {
            System.out.println("Salary with value " + target + " is not present in our database");
        } else {
           System.out.println("Salary with value " + target + " is  present in our database");
        }
    }
}

