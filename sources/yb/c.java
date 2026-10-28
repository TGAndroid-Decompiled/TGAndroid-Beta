package yb;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import o6.l;
public final class c {
    public final HashMap f52573a = new HashMap();

    public c(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            bVar.getClass();
            if (this.f52573a.containsKey(ac.b.class)) {
                Integer num = (Integer) hashMap.get(ac.b.class);
                l.h(num);
                if (num.intValue() <= 0) {
                }
            }
            this.f52573a.put(ac.b.class, bVar.f52572a);
            hashMap.put(ac.b.class, 0);
        }
    }
}
