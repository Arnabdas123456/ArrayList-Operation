import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
  public static void main(String[] args) {
    
    ArrayList<Integer> list=new ArrayList<Integer>();
   
//Add element
list.add(1);
list.add(2);
list.add(3);
System.out.println(list);
   
//Get element
int element=list.get(2);
System.out.println(element);

//modify element
list.add(3,4);
System.out.println(list);

//Delete element
list.remove(3);
System.out.println(list);

//Size of ArrayList
int size=list.size();
System.out.println(size);

//Loop
for(int i=0; i<list.size();i++)
{
   System.out.println(list.get(i));
}

//Sorting in ArrayList
Collections.sort(list);
System.out.println(list);
 
}
    
}
