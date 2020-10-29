import java.util.Scanner;

public class uc1_employee_attendance {
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

		int Wage_per_hr=20;
		int num_hr_FULL_TIME=8;
                int num_hr_PART_TIME=4;
		System.out.println("daily wage of the employee is:"+Wage_per_hr*num_hr_FULL_TIME );
                System.out.println("daily wage of the employee is:"+Wage_per_hr*num_hr_PART_TIME );
	}

//UC4 EMPLOYEE WAGE USING SWITCH CASES

       void employee_wage_using_cases(){
                int Wage_per_hr=20;
                int num_hr_FULL_TIME=8;
                int num_hr_PART_TIME=4;
                
                switch ()

	}
void employee_wage_using_cases(){
         int Wage_per_hr=20;
         int num_hr_FULL_TIME=8;
         int num_hr_PART_TIME=4;
         System.out.println("enter 1 for employee full-time or 2 for part-time 3 if employee is absent:");
         Scanner obj=new Scanner(System.in);
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



	public static void main(String[] args) {
                new uc1_employee_attendance().Attendance();
                new uc1_employee_attendance().employee_wage_using_cases();
        }


}

