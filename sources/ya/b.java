package ya;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class b {
    public final String f48728a;
    public final c f48729b;

    public b(Set set, c cVar) {
        this.f48728a = b(set);
        this.f48729b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f48726a);
            sb2.append('/');
            sb2.append(aVar.f48727b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f48728a;
        c cVar = this.f48729b;
        synchronized (((HashSet) cVar.f48732b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f48732b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.A0());
    }
}
