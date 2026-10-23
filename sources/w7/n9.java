package w7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
public abstract class n9 {
    public static HashMap a(wc.a aVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("number", o9.e(aVar.f48916a));
        hashMap2.put("cvc", o9.e(aVar.f48917b));
        hashMap2.put("exp_month", aVar.f48918c);
        hashMap2.put("exp_year", aVar.d);
        hashMap2.put("name", o9.e(aVar.e));
        hashMap2.put("currency", o9.e(aVar.f48926n));
        hashMap2.put("address_line1", o9.e(aVar.f48919f));
        hashMap2.put("address_line2", o9.e(aVar.f48920g));
        hashMap2.put("address_city", o9.e(aVar.h));
        hashMap2.put("address_zip", o9.e(aVar.f48922j));
        hashMap2.put("address_state", o9.e(aVar.f48921i));
        hashMap2.put("address_country", o9.e(aVar.f48923k));
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
