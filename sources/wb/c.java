package wb;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import n6.m;
public final class c {
    public final HashMap f50554a = new HashMap();

    public c(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            bVar.getClass();
            if (this.f50554a.containsKey(yb.a.class)) {
                Integer num = (Integer) hashMap.get(yb.a.class);
                m.h(num);
                if (num.intValue() <= 0) {
                }
            }
            this.f50554a.put(yb.a.class, bVar.f50553a);
            hashMap.put(yb.a.class, 0);
        }
    }
}
