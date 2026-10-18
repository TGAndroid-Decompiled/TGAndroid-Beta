package w7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
public abstract class o9 {
    public static HashMap a(wc.a aVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("number", p9.e(aVar.f48906a));
        hashMap2.put("cvc", p9.e(aVar.f48907b));
        hashMap2.put("exp_month", aVar.f48908c);
        hashMap2.put("exp_year", aVar.d);
        hashMap2.put("name", p9.e(aVar.e));
        hashMap2.put("currency", p9.e(aVar.f48916n));
        hashMap2.put("address_line1", p9.e(aVar.f48909f));
        hashMap2.put("address_line2", p9.e(aVar.f48910g));
        hashMap2.put("address_city", p9.e(aVar.h));
        hashMap2.put("address_zip", p9.e(aVar.f48912j));
        hashMap2.put("address_state", p9.e(aVar.f48911i));
        hashMap2.put("address_country", p9.e(aVar.f48913k));
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
