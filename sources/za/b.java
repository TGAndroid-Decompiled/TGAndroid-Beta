package za;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class b {
    public final String f52837a;
    public final c f52838b;

    public b(Set set, c cVar) {
        this.f52837a = b(set);
        this.f52838b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f52835a);
            sb2.append('/');
            sb2.append(aVar.f52836b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f52837a;
        c cVar = this.f52838b;
        synchronized (((HashSet) cVar.f52841b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f52841b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.O());
    }
}
