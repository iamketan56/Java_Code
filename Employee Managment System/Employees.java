package Lecture1;
import java.io.*;
public class Employees {
public static void main(String[] args) throws NumberFormatException, IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String fileName = "C:\\Users\\sande\\OneDrive\\Desktop\\ketan.txt";
int choice;
do {System.out.println("1. Add an Employee");
System.out.println("2. Display All");
System.out.println("3. Exit");
System.out.println("Enter your choice: ");
choice = Integer.parseInt(br.readLine());
switch(choice) {
case 1:
BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
System.out.println("Enter Employee Id");
String id = br.readLine();
writer.append("\n");
writer.append(' ');
writer.append(id);
System.out.println("Enter Employee Name");String name = br.readLine();
writer.append(' ');
writer.append(name);
System.out.println("Enter Employee Age:");
String age = br.readLine();
writer.append(' ');
writer.append(age);
System.out.println("Enter Employee Designation");
String des = br.readLine();
writer.append("\n");
writer.append(' ');
writer.append(des);
System.out.println("Enter Employee salary:");
String sal = br.readLine();
writer.append(' ');
writer.append(sal);
writer.append("\n");
writer.close();
break;case 2:
FileReader fr = new FileReader("C:\\\\Users\\\\sande\\\\OneDrive\\\\Desktop\\\\ketan.txt");
int ch;
System.out.println("*********** Start of Report**********");
while ((ch=fr.read())!=-1)
System.out.print((char)ch);
System.out.println("********** End of Report***********");
fr.close();
break;
}
}while(choice!=3);
}
}