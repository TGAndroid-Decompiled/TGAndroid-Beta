package xa;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class b {
    public final String f51339a;
    public final c f51340b;

    public b(Set set, c cVar) {
        this.f51339a = b(set);
        this.f51340b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f51337a);
            sb2.append('/');
            sb2.append(aVar.f51338b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f51339a;
        c cVar = this.f51340b;
        synchronized (((HashSet) cVar.f51343b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f51343b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.o());
    }
}
