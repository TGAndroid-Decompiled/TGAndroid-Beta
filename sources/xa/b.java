package xa;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class b {
    public final String f51331a;
    public final c f51332b;

    public b(Set set, c cVar) {
        this.f51331a = b(set);
        this.f51332b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f51329a);
            sb2.append('/');
            sb2.append(aVar.f51330b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f51331a;
        c cVar = this.f51332b;
        synchronized (((HashSet) cVar.f51335b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f51335b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.o());
    }
}
