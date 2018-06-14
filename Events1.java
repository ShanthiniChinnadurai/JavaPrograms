
import java.io.*;
import java.util.*;

class Events1
{
    public static void main(String[] args)
    {
        Agenda1 a1=new Agenda1(1,"10.00 A.M","Welcome Speech",101);
        Agenda1 a2=new Agenda1(1,"11.00 A.M","Debate",102);
        Agenda1 a3=new Agenda1(1,"11.30 A.M","Chess",103);
        Agenda1 a4=new Agenda1(1,"12.00 P.M","Culturals",104);
        Agenda1 a5=new Agenda1(2,"10.00 A.M","Welcome Speech",101);
        Agenda1 a6=new Agenda1(2,"11.00 A.M","Project Expo",105);
        List<Agenda1> eve1=new ArrayList<Agenda1>();
        eve1.add(a1);
        eve1.add(a2);
        eve1.add(a3);
        eve1.add(a4);
        List<Agenda1> eve2=new ArrayList<Agenda1>();
        eve2.add(a5);
        eve2.add(a6);
        Fun E1=new Fun(1,"02/03/2018","CBE",eve1);
        Fun E2=new Fun(2,"04/10/2018","CBE",eve2);
        E1.print();
        E2.print();

    }
}