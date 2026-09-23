package w7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
public abstract class r8 {
    public static HashMap a(uc.a aVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("number", s8.e(aVar.f43615a));
        hashMap2.put("cvc", s8.e(aVar.f43616b));
        hashMap2.put("exp_month", aVar.f43617c);
        hashMap2.put("exp_year", aVar.d);
        hashMap2.put("name", s8.e(aVar.e));
        hashMap2.put("currency", s8.e(aVar.f43625n));
        hashMap2.put("address_line1", s8.e(aVar.f43618f));
        hashMap2.put("address_line2", s8.e(aVar.f43619g));
        hashMap2.put("address_city", s8.e(aVar.h));
        hashMap2.put("address_zip", s8.e(aVar.f43621j));
        hashMap2.put("address_state", s8.e(aVar.f43620i));
        hashMap2.put("address_country", s8.e(aVar.f43622k));
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
