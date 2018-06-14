import java.util.*;
import java.util.Collection;    
class College {    
//int id;    
String clg_name,dep1,dep2,dep3,dep4,dep5,dep6,dep7;    
//int quantity;    
public College(String clg_name, String dep1, String dep2, String dep3, String dep4, String dep5, String dep6, String dep7) {    
    this.clg_name = clg_name;    
    this.dep1 = dep1;
    this.dep2 = dep2;
    this.dep3 = dep3; 
    this.dep4 = dep4;
    this.dep5 = dep5;
    this.dep6 = dep6;
    this.dep7 = dep7;   
       
}    
}    
public class MapExample {    
public static void main(String[] args) {    
    //Creating map of Books    
    Map<Integer,College> map=new HashMap<Integer,College>();    
    //Creating Books

    College b1=new College("Coimbatore Institute of Engineering and Technology","CSE","ECE","IT","CIVIL","MCT","MECH","EEE");    
    College b2=new College("SNS College of Engineering","CSE","ECE","IT","CIVIL","MCT","MECH","EEE");    
    College b3=new College("JANSONS Institute of Technology","CSE","ECE","IT","CIVIL","MCT","MECH","EEE");    
    //Adding Books to map   
    map.put(7105,b1);  
    map.put(7133,b2);  
    map.put(7111,b3);  
    
    //Traversing map  
    for(Map.Entry<Integer, College> entry:map.entrySet()){    
        int key=entry.getKey();  
        College b=entry.getValue();  
        System.out.println("College code:"+key+"\n"+"College name:"+b.clg_name);  
        System.out.println("Available Departments:"+"\n"+b.dep1+"\n"+b.dep2+"\n"+b.dep3+"\n"+b.dep4+"\n"+b.dep5+"\n"+b.dep6+"\n"+b.dep7);   
    }    
}    
}    