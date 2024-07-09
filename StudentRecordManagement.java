import java.util.LinkedList;
import java.util.Scanner;  
public class StudentRecordManagement {
     LinkedList<Record> list; 
    public StudentRecordManagement() {  
        list = new LinkedList<>(); 
    }  
    public void add(Record record) {   
        if (!find(record.getrollNum())) {  
            list.add(record);  
        } else { 
            System.out.println("Data is already exists in the Record list");  
        }  
    }  
    public boolean find(int rollNum) {  
        for (Record l : list) {  
            if (l.getrollNum() == rollNum) {  
                System.out.println(l);  
                return true;  
            }  
        }  
        return false; 
    } 
    public void delete(int recrollNum) {  
        Record recordDel = null; 
        for (Record ll : list) {  
            if (ll.getrollNum() == recrollNum) {  
                recordDel = ll;  
            }  
        }  
        if (recordDel == null) { 
            System.out.println("Invalid record Id");  
        } else {  
            list.remove(recordDel); 
            System.out.println("Successfully removed record from the list");  
        }  
    } 
    public Record findRecord(int rollNum) {  
        for (Record l : list) {  
            if (l.getrollNum() == rollNum) {  
                return l; 
            }  
        } 
        return null;
    }  
    public void update(int roll, Scanner input) {  
        if (find(roll)) {  
            Record rec = findRecord(roll); 
            System.out.print("Enter new Student roll Number ! ");  
            int rollNum = input.nextInt();  
            System.out.print("Enter new Student contact Number ! ");  
            long contactNum = input.nextLong();  
            input.nextLine();  
            System.out.print("Please , enter the updated student's name: ");  
            String name = input.nextLine(); 
            rec.setrollNum(rollNum);  
            rec.setName(name);  
            rec.setContactNum(contactNum);  
            System.out.println("Record Updated Successfully");  
        } else {  
            System.out.println("Record was not Found in the Student list");  
        }  
    }   
    public void display() {  
        if (list.isEmpty()) {  
            System.out.println("The list has no records\n");  
        }  
        for (Record record : list) {   
            System.out.println(record.toString());  
        }  
    }  
}