package xa;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class b {
    public final String f49328a;
    public final c f49329b;

    public b(Set set, c cVar) {
        this.f49328a = b(set);
        this.f49329b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f49326a);
            sb2.append('/');
            sb2.append(aVar.f49327b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f49328a;
        c cVar = this.f49329b;
        synchronized (((HashSet) cVar.f49332b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f49332b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.I());
    }
}
