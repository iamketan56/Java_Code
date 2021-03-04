package Lecture1;

public class Employee {
	public static void main(String h[]) {
		int x = Integer.parseInt(h[0]);
		Data a[] = new Data[7];
		a[0] = new Data(1001, "Ashish", "01/04/2009", "e", "R&D", 20000, 8000, 3000); 
		a[1] = new Data(1002, "Sushma", "23/08/2012", "c", "PM", 30000, 12000, 9000); 
		a[2] = new Data(1003, "Rahul", "12/11/2008", "k", "Acct", 10000, 8000, 1000); 
		a[3] = new Data(1004, "Chahat", "29/01/2013", "r", "Front Desk", 12000, 6000, 2000); 
		a[4] = new Data(1005, "Ranjan", "16/07/2005", "m ", "Engg", 50000, 20000 , 20000); 
		a[5] = new Data(1006, "Suman ", "1/1/2000", "e", "Manufacturing", 23000, 9000, 4400); 
		a[6] = new Data(1007, "Tanmay", "12/06/2006", "c", "PM", 29000, 12000, 10000); 
		
		
		salary b[] = new salary[5];
		b[0] = new salary("e", "Engineer", 20000);
		b[1] = new salary("c", "Consultant", 32000);
		b[2] = new salary("k", "Clerk", 12000);
		b[3] = new salary("r", "Receptionist", 15000);
		b[4] = new salary("m", "Manager", 40000);
		boolean flag = false;
		for(int i = 0; i < 7; i++) {
			String des = "";
			int pay = 0;
			if(x == a[i].id) {
				flag = true;
				for(int j = 0; j < 5;j++) {
					if(a[i].code == b[j].code) {
						des = b[j].desigination;
						pay = b[j].da;
					}
				}
				pay = pay+a[i].basic+a[i].hra-a[i].it;
				System.out.println(a[i].id+"  "+ a[i].name+"  "+a[i].department+"  "+des+"  "+pay);
			}
		}
		if(!flag)
		{
			System.out.println("There is no employee with empid :" +x);
		}
	}
}

class Data{
	int id;
	String name;
	String date;
	String code;
	String department;
	int basic;
	int hra;
	int it;
	Data(int id, String name, String date, 	String code, String department, int basic, 	int hra, int it) {
		this.id = id;
		this.name = name;
		this.date = date;
		this.code = code;
		this.department = department;
		this.basic = basic;
		this.hra = hra;
		this.it = it;
	}
}
class salary {
	String code;
	String desigination;
	int da;
	salary(String code, String desigination, int da) {
		this.code = code;
		this.desigination = desigination;
		this.da =da;
	}
}