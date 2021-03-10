package listy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>(10);

        arrayList.add("Auto");
        arrayList.add("Auto_2");
        arrayList.add("Auto_3");
        arrayList.add(0,"Auto_4");
        System.out.println(arrayList);

        arrayList.clear();
        System.out.println(arrayList);

        arrayList.add("Auto_1");
        arrayList.add("Auto_2");
        System.out.println(arrayList);
        System.out.println(arrayList.indexOf("Auto_2"));



        System.out.println(arrayList.size());
        arrayList.set(1,"new");
        System.out.println(arrayList);

        arrayList.remove("Auto_1");
        System.out.println(arrayList);
        arrayList.remove(0);
        System.out.println(arrayList);

        arrayList.add("100");
        arrayList.add("34");
        arrayList.add("348");
        arrayList.add(0,"67");
        System.out.println(arrayList);

        Collections.sort(arrayList);
        System.out.println(arrayList);

        System.out.println(arrayList.get(0));


        for (String element: arrayList) {
            System.out.println(element);
        }


//        List<String> dni = List.of("pon","wt","śr");

//        for(){
//            // pobranie od użytk
//            //1
//            //for(długość listy){
//            //if(1==i)j--;
//            //else array.add
//            //}
//        }
    }
}
