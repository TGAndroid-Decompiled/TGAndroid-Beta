package xa;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class b {
    public final String f51224a;
    public final c f51225b;

    public b(Set set, c cVar) {
        this.f51224a = b(set);
        this.f51225b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f51222a);
            sb2.append('/');
            sb2.append(aVar.f51223b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f51224a;
        c cVar = this.f51225b;
        synchronized (((HashSet) cVar.f51228b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f51228b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.m());
    }
}
