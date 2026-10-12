package w7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
public abstract class y8 {
    public static HashMap a(vc.a aVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("number", z8.e(aVar.f49753a));
        hashMap2.put("cvc", z8.e(aVar.f49754b));
        hashMap2.put("exp_month", aVar.f49755c);
        hashMap2.put("exp_year", aVar.d);
        hashMap2.put("name", z8.e(aVar.f49756e));
        hashMap2.put("currency", z8.e(aVar.f49764n));
        hashMap2.put("address_line1", z8.e(aVar.f49757f));
        hashMap2.put("address_line2", z8.e(aVar.f49758g));
        hashMap2.put("address_city", z8.e(aVar.h));
        hashMap2.put("address_zip", z8.e(aVar.f49760j));
        hashMap2.put("address_state", z8.e(aVar.f49759i));
        hashMap2.put("address_country", z8.e(aVar.f49761k));
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
