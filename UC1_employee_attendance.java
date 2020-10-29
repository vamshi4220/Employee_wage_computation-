
public class uc1_employee_attendance {
//UC1 ATTENDANCE METHOD
	void Attendance(){
		 if(Math.random()<0.5) {
			 System.out.println("Employee is absent");
		 }
		 else System.out.println("Employee is present");
	}

//UC2 EMPLOYEE WAGE
   
       void employee_wage()  {
		
		int Wage_per_hr=20;
		int num_hr=8;
		System.out.println("daily wage of the employee is:"+Wage_per_hr*num_hr );
	}

	public static void main(String[] args) {
                new uc1_employee_attendance().Attendance();
                new uc1_employee_attendance().employee_wage();
        }


}

