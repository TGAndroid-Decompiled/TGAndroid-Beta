package xa;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class b {
    public final String f45997a;
    public final c f45998b;

    public b(Set set, c cVar) {
        this.f45997a = b(set);
        this.f45998b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f45995a);
            sb2.append('/');
            sb2.append(aVar.f45996b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f45997a;
        c cVar = this.f45998b;
        synchronized (((HashSet) cVar.f46001b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f46001b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.u());
    }
}
