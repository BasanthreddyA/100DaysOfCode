import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
  //  TreeSet < String > ss = new TreeSet <> ();
  List<String> ss=new ArrayList<>();
    
    /*ss.add ("tirmaalesh");
    ss.add ("saikumar");
    ss.add ("mummy");
    ss.add ("uncle");
    ss.add ("teja");
     ss.add("Basanth");*/
     
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     String[] str=new String[a];
     for(int i=0;i<a;i++){
         str[i]=sc.next();
         //ss.add(str[i]);
     }
     for(int i=0;i<a;i++){
         ss.add(str[i]);
     }
        Collections.sort(ss);
        
    Iterator<String> itr=ss.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
  
  }
}
