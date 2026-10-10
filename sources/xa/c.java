package xa;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class c {
    public final String f51147a;
    public final d f51148b;

    public c(Set set, d dVar) {
        this.f51147a = b(set);
        this.f51148b = dVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f51144a);
            sb2.append('/');
            sb2.append(aVar.f51145b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f51147a;
        d dVar = this.f51148b;
        synchronized (((HashSet) dVar.f51151b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) dVar.f51151b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(dVar.l());
    }
}
