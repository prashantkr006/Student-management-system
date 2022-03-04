import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Start {

	public static void main(String[] args)throws IOException {
		System.out.println("Welcome to student management app");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("PRESS 1 to ADD student");
			System.out.println("PRESS 2 to Delete student");
			System.out.println("PRESS 3 to Display student");
			System.out.println("PRESS 4 to exit app");
			int c = Integer.parseInt(br.readLine());
			
			if(c==1) {
				//add
				System.out.println("Enter userName");
				String name = br.readLine();
				
				System.out.println("Enter phone number");
				String  phone = br.readLine();
				
				System.out.println("Enter city");
				String city = br.readLine();
				
				//create student object to store student
				Student st = new Student(name, phone, city);
				boolean ans = StudentDao.insertStudentToDB(st);
				if(ans) {
					System.out.println("student is added successfully...");
				}else
				{
					System.out.println("Something went wrong!");
				}
			}
			else if(c==2) {
				//delete
			}
			else if(c==3) {
				//display
			}
			else if(c==4) {
				//exit
				break;
			}
			else {
				
			}
		}
		System.out.println("THANK YOU!!");
	}

}
