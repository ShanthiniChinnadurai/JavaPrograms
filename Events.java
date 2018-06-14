import java.io.*;
import java.util.*;
 

class Event 
{
    
    int id ;
    String dt;
    String location;
    private List<Agenda> agenda;
     
    Event(int id,String dt, String location,List<Agenda> agenda) 
    {
         
        this.id = id;
        this.dt = dt;
        this.location = location;
        this.agenda=agenda;
         
    }
    void print()
    {
        System.out.println("\n"+"Event Number:"+id+"\n"+"Date:"+dt+"\n"+"Location:"+location+"\n");
        for(Agenda a:agenda)
        {
            System.out.println("Agenda ID:"+a.agendaid+"\t"+"Description:"+a.desc+"\t"+"Timing:"+a.time);
        }
    }
}
 

class Agenda
{
    int eventid;
    int agendaid;
    String time;
    String desc;
    Agenda(int eventid,String time,String desc,int agendaid)
    {
      this.eventid=eventid;
      this.time=time;
      this.desc=desc;
      this.agendaid=agendaid;
    }
}
class Events
{
    public static void main(String[] args)
    {
        Agenda a1=new Agenda(1,"10.00 A.M","Welcome Speech",101);
        Agenda a2=new Agenda(1,"11.00 A.M","Debate",102);
        Agenda a3=new Agenda(1,"11.30 A.M","Chess",103);
        Agenda a4=new Agenda(1,"12.00 P.M","Culturals",104);
        Agenda a5=new Agenda(2,"10.00 A.M","Welcome Speech",101);
        Agenda a6=new Agenda(2,"11.00 A.M","Project Expo",105);
        List<Agenda> eve1=new ArrayList<Agenda>();
        eve1.add(a1);
        eve1.add(a2);
        eve1.add(a3);
        eve1.add(a4);
        List<Agenda> eve2=new ArrayList<Agenda>();
        eve2.add(a5);
        eve2.add(a6);
        Event E1=new Event(1,"02/03/2018","CBE",eve1);
        Event E2=new Event(2,"04/10/2018","CBE",eve2);
        E1.print();
        E2.print();

    }
}