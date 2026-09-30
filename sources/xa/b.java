package xa;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class b {
    public final String f46013a;
    public final c f46014b;

    public b(Set set, c cVar) {
        this.f46013a = b(set);
        this.f46014b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f46011a);
            sb2.append('/');
            sb2.append(aVar.f46012b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f46013a;
        c cVar = this.f46014b;
        synchronized (((HashSet) cVar.f46017b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f46017b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.u());
    }
}
