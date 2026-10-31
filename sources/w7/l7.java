package w7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
public abstract class l7 {
    public static HashMap a(oc.a aVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("number", m7.e(aVar.f14130a));
        hashMap2.put("cvc", m7.e(aVar.f14131b));
        hashMap2.put("exp_month", aVar.f14132c);
        hashMap2.put("exp_year", aVar.d);
        hashMap2.put("name", m7.e(aVar.e));
        hashMap2.put("currency", m7.e(aVar.f14140n));
        hashMap2.put("address_line1", m7.e(aVar.f14133f));
        hashMap2.put("address_line2", m7.e(aVar.f14134g));
        hashMap2.put("address_city", m7.e(aVar.h));
        hashMap2.put("address_zip", m7.e(aVar.f14136j));
        hashMap2.put("address_state", m7.e(aVar.f14135i));
        hashMap2.put("address_country", m7.e(aVar.f14137k));
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
