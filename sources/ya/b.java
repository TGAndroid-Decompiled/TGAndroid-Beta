package ya;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class b {
    public final String f50132a;
    public final c f50133b;

    public b(Set set, c cVar) {
        this.f50132a = b(set);
        this.f50133b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f50130a);
            sb2.append('/');
            sb2.append(aVar.f50131b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f50132a;
        c cVar = this.f50133b;
        synchronized (((HashSet) cVar.f50136b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f50136b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.T());
    }
}
