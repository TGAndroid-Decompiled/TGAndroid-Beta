package za;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class b {
    public final String f55446a;
    public final c f55447b;

    public b(Set set, c cVar) {
        this.f55446a = b(set);
        this.f55447b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f55444a);
            sb2.append('/');
            sb2.append(aVar.f55445b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f55446a;
        c cVar = this.f55447b;
        synchronized (((HashSet) cVar.f55450b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f55450b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.q());
    }
}
