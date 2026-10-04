package w7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
public abstract class t8 {
    public static HashMap a(uc.a aVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("number", u8.e(aVar.f47591a));
        hashMap2.put("cvc", u8.e(aVar.f47592b));
        hashMap2.put("exp_month", aVar.f47593c);
        hashMap2.put("exp_year", aVar.d);
        hashMap2.put("name", u8.e(aVar.f47594e));
        hashMap2.put("currency", u8.e(aVar.f47602n));
        hashMap2.put("address_line1", u8.e(aVar.f47595f));
        hashMap2.put("address_line2", u8.e(aVar.f47596g));
        hashMap2.put("address_city", u8.e(aVar.h));
        hashMap2.put("address_zip", u8.e(aVar.f47598j));
        hashMap2.put("address_state", u8.e(aVar.f47597i));
        hashMap2.put("address_country", u8.e(aVar.f47599k));
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
