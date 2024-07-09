import java.util.Scanner;
public class StudentRecordLinkedList {
      public static void main(String[] args)  
    { 
        StudentRecordManagement hr = new StudentRecordManagement();
        Record record = new Record();  
        record.setrollNum(81);  
        record.setContactNum(94790000);  
        record.setName("priya");   
        hr.add(record); 
        Scanner input = new Scanner(System.in);   
        int option = 0;  
        do {  
            menu();  
            option = input.nextInt(); 
            switch (option) {  
            case 1: 
                System.out.print("Enter the Student roll Number :- ");  
                int rollNum = input.nextInt();  
  
                System.out.print("Enter the Student contact Number :- ");  
                long contactNum = input.nextLong();  
                input.nextLine(); 
                System.out.print("Enter the Student Name :- ");  
                String name = input.nextLine(); 
                record = new Record(name, rollNum, contactNum);  
                hr.add(record);  
                System.out.println(record.toString());  
                break; 
            case 2:
                System.out.print("Enter the Student roll number :- ");  
                int rroll = input.nextInt(); 
                hr.delete(rroll); 
                break;
            case 3:
                System.out.print("Enter the Student roll number :- ");  
                int rrollNo = input.nextInt();  
                hr.update(rrollNo, input); 
                break;  
            case 4: 
                System.out.print("Enter the Student roll number :- ");  
                int bookId = input.nextInt();  
                if (!hr.find(bookId)) {  
                    System.out.println("Student roll number does not exist\n");  
                }  
                break;
            case 5:  
                hr.display();  
                break; 
            case 6:
                System.out.println("\nThanks for using the Student Record Management System. Have a great day!\n");  
                System.exit(0);  
                break; 
            default: 
                System.out.println("\n you enter the invalid input\n");  
                break;  
            }  
        }   
        while (option != 6);  
    } 
    public static void menu()  
    {
        System.out.println("Description are present here , that you will choose any one ! ");  
        System.out.println("Enter 1 , for Add a Student");  
        System.out.println("Enter 2 , for Delete a Student");  
        System.out.println("Enter 3 , for Update a Student");  
        System.out.println("Enter 4 , for Search a Student");  
        System.out.println("Enter 5 , for Display a Students");  
        System.out.println("Enter 6 , for Exit program");  
        System.out.print("press any one key to perform certain operation :- ");  
    }  
}
