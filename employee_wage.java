import java.util.Scanner;

public class Employee_Wage extends Company{

//scanner obj is used in two methods
Scanner obj=new Scanner(System.in);
int Wage_per_hr=20;
int num_hr_FULL_TIME=8;
int num_hr_PART_TIME=4;


//UC1 ATTENDANCE METHOD
	void Attendance(){
		 if(Math.random()<0.5) {
			 System.out.println("Employee is absent");
		 }
		 else System.out.println("Employee is present");
	}

//UC2 EMPLOYEE WAGE
//UC3 ADDED PART TIME EMPLOYEE

       void employee_wage()  {

		System.out.println("daily wage of the employee is:"+Wage_per_hr*num_hr_FULL_TIME );
                System.out.println("daily wage of the employee is:"+Wage_per_hr*num_hr_PART_TIME );
	}

//UC4 EMPLOYEE WAGE USING SWITCH CASES


    void employee_wage_using_cases(){
         System.out.println("enter 1 for employee full-time or 2 for part-time 3 if employee is absent:");
         int choice=obj.nextInt();
         switch (choice) {
         case 1:
        	 System.out.println("employee is fulltime:"+Wage_per_hr*num_hr_FULL_TIME);
        	 break;
         case 2:
     	 	System.out.println("employee is part-time:"+Wage_per_hr*num_hr_PART_TIME);
                break;
         case 3:
     	 	System.out.println("employee is absent:"+0);
		break;
     	 default:
     		 System.out.println("invalid input");
		break;
         }
	 }

//UC5 EMPLOYEE WAGE PER MONTH by taking 25 working days

      void wage_per_month(){
		int num_of_working_days=25;
                System.out.println("monthly wage of the full-time employee is:"+Wage_per_hr*num_hr_FULL_TIME*num_of_working_days );
                System.out.println("monthly wage of the part-time employee is:"+Wage_per_hr*num_hr_PART_TIME*num_of_working_days );
	}

void Wage_condition(){
		 int hr_count=0;
		 int day_count=0;
		 int total_wage=0;
		 System.out.println("enter 1 for full-time or 2 for part-time:");
		   int choice=obj.nextInt();
		if(choice == 1) {   
	    
		    while( hr_count < 200  && day_count < 20 ) {
		    total_wage+=num_hr_FULL_TIME*Wage_per_hr;
		    hr_count+=8;
		    day_count++;
		    }	

	     } 
		else if(choice == 2) {
			while( hr_count < 200  && day_count <20 ) {
				total_wage+=num_hr_PART_TIME*Wage_per_hr;
			    hr_count+=4;
			    day_count++;
			 }	
		}
		else System.out.println("wrong input");
		System.out.println("total wage is:"+total_wage);
		} 



	public static void main(String[] args) {
             
	        new employee_wage().Attendance();
                new employee_wage().company("BigBazar",8,25);
        }


}

public class Company {

	 String name_of_company;

	 public void corporation(String name_of_company,int working_hrs,int salary_per_hr) {
		this.name_of_company=name_of_company;
		System.out.println("company name:"+name_of_company);
		new Company().wage(working_hrs,salary_per_hr);
        }
       
        public void wage(int salary_per_hr,int working_hrs) {
	 this.salary_per_hr=salary_per_hr;
	 this.working_hrs=working_hrs;
	 System.out.println("employee wage is:"+salary_per_hr*working_hrs);
 	}
}
