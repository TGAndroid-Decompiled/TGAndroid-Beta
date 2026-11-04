package x7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
public abstract class c5 {
    public static HashMap a(rc.a aVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("number", d5.e(aVar.f54478a));
        hashMap2.put("cvc", d5.e(aVar.f54479b));
        hashMap2.put("exp_month", aVar.f54480c);
        hashMap2.put("exp_year", aVar.d);
        hashMap2.put("name", d5.e(aVar.f54481e));
        hashMap2.put("currency", d5.e(aVar.f54489n));
        hashMap2.put("address_line1", d5.e(aVar.f54482f));
        hashMap2.put("address_line2", d5.e(aVar.f54483g));
        hashMap2.put("address_city", d5.e(aVar.h));
        hashMap2.put("address_zip", d5.e(aVar.f54485j));
        hashMap2.put("address_state", d5.e(aVar.f54484i));
        hashMap2.put("address_country", d5.e(aVar.f54486k));
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
