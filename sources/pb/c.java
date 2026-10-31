package pb;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import n6.l;
public final class c {
    public final HashMap f44900a = new HashMap();

    public c(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            bVar.getClass();
            if (this.f44900a.containsKey(rb.a.class)) {
                Integer num = (Integer) hashMap.get(rb.a.class);
                l.g(num);
                if (num.intValue() <= 0) {
                }
            }
            this.f44900a.put(rb.a.class, bVar.f44899a);
            hashMap.put(rb.a.class, 0);
        }
    }
}
