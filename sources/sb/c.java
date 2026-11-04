package sb;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import p6.m;
public final class c {
    public final HashMap f54695a = new HashMap();

    public c(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            bVar.getClass();
            if (this.f54695a.containsKey(ub.a.class)) {
                Integer num = (Integer) hashMap.get(ub.a.class);
                m.g(num);
                if (num.intValue() <= 0) {
                }
            }
            this.f54695a.put(ub.a.class, bVar.f54694a);
            hashMap.put(ub.a.class, 0);
        }
    }
}
