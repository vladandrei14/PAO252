import java.util.*;

public class Main {
    public static void main(String[] args) {


        List listA = new ArrayList();
        List<String> listaStringuri = new ArrayList<>();

        String[] array = {"ana","are", "mere"};
        List newList = Arrays.asList(array);
        List finalList = Collections.unmodifiableList(newList);

        finalList.add("mama");

        listA.add(1);
        listA.add(1);
        System.out.println(listA);

        Set set1 = new HashSet();
        Set<String> set2 = new HashSet<>();


        set2.add("test");
        set2.add(new String("test"));

        Iterator i = set2.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }

        Map map = new HashMap();
        map.put(1,"test");
        map.put(2,"test");
        map.put(1,"test2");
        System.out.println(map);


        map.entrySet();
    }
}