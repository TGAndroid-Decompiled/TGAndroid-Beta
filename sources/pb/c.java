package pb;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import n6.l;
public final class c {
    public final HashMap f44911a = new HashMap();

    public c(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            bVar.getClass();
            if (this.f44911a.containsKey(rb.a.class)) {
                Integer num = (Integer) hashMap.get(rb.a.class);
                l.g(num);
                if (num.intValue() <= 0) {
                }
            }
            this.f44911a.put(rb.a.class, bVar.f44910a);
            hashMap.put(rb.a.class, 0);
        }
    }
}
