import java.io.*;
import java.util.*;

class Agenda1
{
    int eventid;
    int agendaid;
    String time;
    String desc;
    Agenda1(int eventid,String time,String desc,int agendaid)
    {
      this.eventid=eventid;
      this.time=time;
      this.desc=desc;
      this.agendaid=agendaid;
    }
}