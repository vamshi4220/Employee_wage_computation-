public class uc1_employee_attendance {

	void Attendance(){
		 if(Math.random()<0.5) {
			 System.out.println("Employee is absent");
		 }
		 else System.out.println("Employee is present");
	}
	
	
	public static void main(String[] args) {
		new uc1_employee_attendance().Attendance();
     
	}

}
