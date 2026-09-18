package xa;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class b {
    public final String f45984a;
    public final c f45985b;

    public b(Set set, c cVar) {
        this.f45984a = b(set);
        this.f45985b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f45982a);
            sb2.append('/');
            sb2.append(aVar.f45983b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f45984a;
        c cVar = this.f45985b;
        synchronized (((HashSet) cVar.f45988b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f45988b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.u());
    }
}
