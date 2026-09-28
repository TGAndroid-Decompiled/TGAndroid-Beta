package w7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
public abstract class s8 {
    public static HashMap a(uc.a aVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("number", t8.e(aVar.f43953a));
        hashMap2.put("cvc", t8.e(aVar.f43954b));
        hashMap2.put("exp_month", aVar.f43955c);
        hashMap2.put("exp_year", aVar.d);
        hashMap2.put("name", t8.e(aVar.e));
        hashMap2.put("currency", t8.e(aVar.f43963n));
        hashMap2.put("address_line1", t8.e(aVar.f43956f));
        hashMap2.put("address_line2", t8.e(aVar.f43957g));
        hashMap2.put("address_city", t8.e(aVar.h));
        hashMap2.put("address_zip", t8.e(aVar.f43959j));
        hashMap2.put("address_state", t8.e(aVar.f43958i));
        hashMap2.put("address_country", t8.e(aVar.f43960k));
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
