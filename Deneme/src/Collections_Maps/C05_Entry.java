package Collections_Maps;

import java.util.Map;
import java.util.Set;

public class C05_Entry {
    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap = ReusableMethods.mapOlustur();

        // Map`in herbir elemani alt alta yazdirin

        Set<Map.Entry<Integer, String>> sinifEntrySet = ogrenciMap.entrySet();


        for (Map.Entry<Integer, String> each: sinifEntrySet
             ) {
            System.out.println(each);
        }

        // Map`in tum elemanlarinda varsa Tester kurs ismini QA olarak degistirelim

        String eachValue;
        for (Map.Entry<Integer, String> each: sinifEntrySet
             ) {
            eachValue = each.getValue();
            eachValue = eachValue.replace("Tester", "QA");
            each.setValue(eachValue);
        }
        System.out.println(ogrenciMap);
    }
}
