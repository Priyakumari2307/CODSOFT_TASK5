import java.util.Scanner;  
public class Record {
    private String name;  
    private int rollNum;  
    private long contactNum; 
    public Record() {} 
    public Record(String name, int rollNum, long contactNum)
    {  
        this.name = name;  
        this.rollNum = rollNum;  
        this.contactNum = contactNum;  
    }  
    public long getContactNum() { return contactNum; } 
    public void setContactNum(long contactNum) 
    {  
        this.contactNum = contactNum;  
    } 
    public int getrollNum() { return rollNum; }  
    public void setrollNum(int rollNum)  
    {  
        this.rollNum = rollNum;  
    }
    public String getName() { return name; } 
    public void setName(String name) { this.name = name; } 
    @Override  
    public String toString()  
    { 
        System.out.println();
        return "Record will be {" +  
            "Name is'" + name + '\'' +  
            ", Rollnumber is " + rollNum +  
            ", ContactNumber is" + contactNum +  
            '}'; 
        
        }  
}