import java.io.*;
import java.util.*;

class Fun
{
    
    int id ;
    String dt;
    String location;
    private List<Agenda1> agenda;
     
    Fun(int id,String dt, String location,List<Agenda1> agenda) 
    {
         
        this.id = id;
        this.dt = dt;
        this.location = location;
        this.agenda=agenda;
         
    }
    void print()
    {
        System.out.println("\n"+"Event Number:"+id+"\n"+"Date:"+dt+"\n"+"Location:"+location+"\n");
        for(Agenda1 a:agenda)
        {
            System.out.println("Agenda ID:"+a.agendaid+"\t"+"Description:"+a.desc+"\t"+"Timing:"+a.time);
        }
    }
}