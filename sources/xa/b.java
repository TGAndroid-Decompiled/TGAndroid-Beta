package xa;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class b {
    public final String f49357a;
    public final c f49358b;

    public b(Set set, c cVar) {
        this.f49357a = b(set);
        this.f49358b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f49355a);
            sb2.append('/');
            sb2.append(aVar.f49356b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f49357a;
        c cVar = this.f49358b;
        synchronized (((HashSet) cVar.f49361b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f49361b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.I());
    }
}
