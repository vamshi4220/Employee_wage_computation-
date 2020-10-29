// UC1 ATTENDANCE
public class uc1_employee_attendance {

	public static void main(String[] args) {
		 if(Math.random()<0.5) {
			 System.out.println("Employee is absent");
		 }
		 else System.out.println("Employee is present");
     
	}

}

//UC2 EMPLOYEE WAGE

public class UC2_employee_wage {

	public static void main(String[] args) {
		int Wage_per_hr=20;
		int num_hr=8;
		System.out.println("daily wage of the employee is:"+Wage_per_hr*num_hr );
	}

}

//UC3 PART TIME WAGE IS CALCULATED

public class Part_Time_wage {

	public static void main(String[] args) {
		int Wage_per_hr=20;
		int num_hr_full_time=8;
		int num_hr_part_time=4;
		System.out.println("daily wage of the fulltime employee is:"+Wage_per_hr*num_hr_full_time );
		System.out.println("daily wage of the fulltime employee is:"+Wage_per_hr*num_hr_part_time );

	}

}

