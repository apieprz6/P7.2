import java.util.*;
public class Josephus
{
    public static void main(String[] args){
        int people=0;
        int counter = 1;
        int temp=0;
        Scanner scan = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList();
        System.out.print("How many people? ");
        people = scan.nextInt();
        while(counter <= people){
            list.add(counter);
            counter++;
        }
        Iterator iter = list.listIterator();
        System.out.println(list);
        while(iter!=null && iter.hasNext()){
            if(list.size()>1){
                iter.next();
                temp=list.getFirst();
                iter.remove();
                if(iter.hasNext()){
                    iter.next();
                    iter.remove();
                }
                list.addLast(temp);
                iter = list.listIterator();
                System.out.println(list);
            }
            else{
                iter = null;
            }
        }
    }
}
