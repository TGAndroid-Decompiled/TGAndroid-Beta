package xa;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class b {
    public final String f46011a;
    public final c f46012b;

    public b(Set set, c cVar) {
        this.f46011a = b(set);
        this.f46012b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f46009a);
            sb2.append('/');
            sb2.append(aVar.f46010b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f46011a;
        c cVar = this.f46012b;
        synchronized (((HashSet) cVar.f46015b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f46015b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.u());
    }
}
