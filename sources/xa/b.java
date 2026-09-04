package xa;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class b {
    public final String f49327a;
    public final c f49328b;

    public b(Set set, c cVar) {
        this.f49327a = b(set);
        this.f49328b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f49325a);
            sb2.append('/');
            sb2.append(aVar.f49326b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f49327a;
        c cVar = this.f49328b;
        synchronized (((HashSet) cVar.f49331b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f49331b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.I());
    }
}
