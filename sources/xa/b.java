package xa;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class b {
    public final String f49356a;
    public final c f49357b;

    public b(Set set, c cVar) {
        this.f49356a = b(set);
        this.f49357b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f49354a);
            sb2.append('/');
            sb2.append(aVar.f49355b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f49356a;
        c cVar = this.f49357b;
        synchronized (((HashSet) cVar.f49360b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f49360b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.I());
    }
}
