package Employee;

import java.util.ArrayList;

import org.hibernate.Session;    
import org.hibernate.SessionFactory;    
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  
  
    
public class StoreDetails {    
public static void main(String[] args) {    
        
      
    StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("HibernateConfig.xml").build();  
          
   Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
  
SessionFactory factory = meta.getSessionFactoryBuilder().build();  
Session session = factory.openSession();  
Transaction t = session.beginTransaction();   
            
    EmployeeModel e1=new EmployeeModel();    
    e1.setId(11);    
    e1.setName("SUPRIYO");    
    e1.setId(12);    
    e1.setName("RISHI"); 
    e1.setId(13);    
    e1.setName("PAROMITA");    
        
    session.save(e1);  
    t.commit();  
    System.out.println("DATA OF EMPLOYEE NAMES successfully saved"); 
    
    ArrayList<EmployeeModel> list=new ArrayList<>();
    
    for(EmployeeModel str:list){
    	System.out.println(str.getId());
    	System.out.println(str.getName());
    }
    factory.close();  
    session.close();    
        
}    
}   