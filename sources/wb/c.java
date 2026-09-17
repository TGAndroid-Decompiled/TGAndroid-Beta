package wb;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import n6.l;
public final class c {
    public final HashMap f48512a = new HashMap();

    public c(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            bVar.getClass();
            if (this.f48512a.containsKey(yb.a.class)) {
                Integer num = (Integer) hashMap.get(yb.a.class);
                l.h(num);
                if (num.intValue() <= 0) {
                }
            }
            this.f48512a.put(yb.a.class, bVar.f48511a);
            hashMap.put(yb.a.class, 0);
        }
    }
}
