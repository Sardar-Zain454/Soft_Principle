
package Pure_Fabrication.Without_Principle;


public class Main {
    
    public static void main(String[] args) {
        
        Clerks C = new Clerks(new int[] {50000, 3000, 80000, 10000, 20000});
        Employees E = new Employees(new int[]{5000, 30000, 80000, 10000, 2000});
        Managers M = new Managers(new int[]{5000, 3000, 8000, 10000, 20000});
        
        
        C.sortData();
        if(C.searchData(23444)) System.out.println("Salary found");
        else System.out.println("Salary is not found");
        
        
        E.sortData();
        if(E.searchData(50000)) System.out.println("Salary found");
        else System.out.println("Salary is not found");
        
        M.sortData();
        if(M.searchData(594934)) System.out.println("Salary found");
        else System.out.println("Salary is not found");
    }
    
}
