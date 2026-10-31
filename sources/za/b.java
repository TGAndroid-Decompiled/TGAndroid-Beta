package za;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class b {
    public final String f55428a;
    public final c f55429b;

    public b(Set set, c cVar) {
        this.f55428a = b(set);
        this.f55429b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f55426a);
            sb2.append('/');
            sb2.append(aVar.f55427b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f55428a;
        c cVar = this.f55429b;
        synchronized (((HashSet) cVar.f55432b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f55432b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.q());
    }
}
