package vb;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import q6.m;
public final class c {
    public final HashMap f57311a = new HashMap();

    public c(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            bVar.getClass();
            if (this.f57311a.containsKey(xb.a.class)) {
                Integer num = (Integer) hashMap.get(xb.a.class);
                m.g(num);
                if (num.intValue() <= 0) {
                }
            }
            this.f57311a.put(xb.a.class, bVar.f57310a);
            hashMap.put(xb.a.class, 0);
        }
    }
}
