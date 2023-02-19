package oopsAssignment;


import java.util.ArrayList;


class Manager extends Assignment2Q2 {
	
    @Override
    public int getSalary(int salary) {
        int incentive = 5000;
        return salary+incentive;
    }
}

class Labour extends Assignment2Q2 {
	
    @Override
    public int getSalary(int salary) {
        int overtime = 500;
        return salary+overtime;
    }
}

 class Assignment2Q2 {
	
	int salary = 10000;
	
    public int getSalary(int salary){
    	return salary;
    }
    
    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries)
    {
    	int salarytotal=0;
    	for(int salary:employeeSalaries)
    	{
    		salarytotal+=salary;
    	}
    	
    	return salarytotal;
    }
 
    public static void main(String[] args) 
    {
    	Assignment2Q2 emp=new Assignment2Q2();
    	
    	Assignment2Q2 manager=new Manager();
    	int salarym = manager.getSalary(emp.salary);
    	
    	Assignment2Q2 labour=new Labour();
    	int salaryl = labour.getSalary(emp.salary);
    	
    	ArrayList<Integer> salaries=new ArrayList<Integer>();
    	salaries.add(salarym);
    	salaries.add(salaryl);
    	
    	
    	int totalEmployeesSalary = emp.totalEmployeesSalary(salaries);
    	System.out.println("TotalEmployeesSalary :" + totalEmployeesSalary);
    }
 }
