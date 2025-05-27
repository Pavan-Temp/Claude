import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1{
    public static void printf(ArrayList<String> s){
        System.out.println(s);
    }
    public static void revision(){
        ArrayList<String> list= new ArrayList<>();
        list.add("a");
        list.add(0,"z");
        printf(list);
        list.remove(0);
        list.remove("hello");
        printf(list);
        System.out.println(list.get(0));
        list.set(0,"temp");
        printf(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.add("sample");
        list.add("sample");
        System.out.println(list.indexOf("sample"));
        System.out.println(list.lastIndexOf("sample"));
        ArrayList<String> temp = new ArrayList<>(list);
        System.out.println(temp);
        temp.clear();
        System.out.println(temp.isEmpty());
        
        ArrayList<String> moreFruits = new ArrayList<>();
        moreFruits.add("Mango");
        list.addAll(moreFruits);
        printf(list);
        list.removeAll(moreFruits);
        printf(list);

        //toArray()
        Object[] arr =list.toArray();
        String[] strarr=list.toArray(new String[0]);
        System.out.println(arr);
        System.out.println(strarr);

    }
    public static void main(String[] args){
        //ArrayList<type> listname = new ArrayList<type>();
        //type can be any wrapper class
        ArrayList<String> list = new ArrayList<>();
        //Basic and get
        list.add("Amma");
        list.add(1,"Nanna");
        System.out.println(list);
        list.add(1,"Rama");
        System.out.println(list.get(0));
        System.out.println(list.get(2));
        list.set(2,"Umasri");
        System.out.println(list);
        //set is going to override the excisted indexed element with new one.
        //add is going to add new index element infront of the excisting element at that particular element.
        list.remove("temp"); //if no elements present it take light not generate any errors.
        System.out.println(list.size());// it will return size of that list
        list.remove(1);
        System.out.println(list);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
         //contains method return true/false according to the element availability in the given list.
         System.out.println(list.contains("temporary")+"\n"+list.contains("Amma")); //this is case-sensitive
         //indexOf method return first occurance of that particular element...
         System.out.println(list.indexOf("Amma")+"\nif not available it is will return: "+list.indexOf("pavan"));
         //lastIndexOf method will return last occurance index element.
         list.add("Amma");
         System.out.println(list);
         System.out.println(list.lastIndexOf("Amma"));
         //clear method will remove entire lists elements
         list.clear();
         System.out.println(list);
         list.add("Amma");
         list.add("Nanna");
         list.add("Sai");
         list.add("Uma");
         System.out.println(list);
         System.out.println("Length of the list is: "+list.size());
         //addAll and removeAll methods adds or removes entire elements of one list into another list
         ArrayList<String> list1 = new ArrayList<>();
         list1.add("Family");
         list1.addAll(list);
         System.out.println(list1);
         list1.removeAll(list);
         System.out.println(list1);
         //Iterator Usage
         Iterator<String> it = list.iterator();
         while(it.hasNext()){
            System.out.println(it.next()+" hello ");
         }
         //ListIterator returns a list iterator (bidirectional)
         ListIterator<String> li = list.listIterator(1);
         System.out.println(li.previous());
         while(li.hasNext()){
            System.out.println(li.next());
         }
         //sort and forEach
         list.add("Abc");
         list.sort(null);
         System.out.println(list);
         //Sublist
         ArrayList<String> temp = new ArrayList<>();
         temp.addAll(list.subList(2,3));
         System.out.println(temp);
         revision();
    }
}