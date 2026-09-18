package w7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
public abstract class r8 {
    public static HashMap a(uc.a aVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("number", s8.e(aVar.f43695a));
        hashMap2.put("cvc", s8.e(aVar.f43696b));
        hashMap2.put("exp_month", aVar.f43697c);
        hashMap2.put("exp_year", aVar.d);
        hashMap2.put("name", s8.e(aVar.e));
        hashMap2.put("currency", s8.e(aVar.f43705n));
        hashMap2.put("address_line1", s8.e(aVar.f43698f));
        hashMap2.put("address_line2", s8.e(aVar.f43699g));
        hashMap2.put("address_city", s8.e(aVar.h));
        hashMap2.put("address_zip", s8.e(aVar.f43701j));
        hashMap2.put("address_state", s8.e(aVar.f43700i));
        hashMap2.put("address_country", s8.e(aVar.f43702k));
        Iterator it = new HashSet(hashMap2.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (hashMap2.get(str) == null) {
                hashMap2.remove(str);
            }
        }
        hashMap.put("card", hashMap2);
        return hashMap;
    }
}
