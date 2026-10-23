package xb;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import n6.l;
public final class c {
    public final HashMap f49772a = new HashMap();

    public c(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            bVar.getClass();
            if (this.f49772a.containsKey(zb.a.class)) {
                Integer num = (Integer) hashMap.get(zb.a.class);
                l.h(num);
                if (num.intValue() <= 0) {
                }
            }
            this.f49772a.put(zb.a.class, bVar.f49771a);
            hashMap.put(zb.a.class, 0);
        }
    }
}
