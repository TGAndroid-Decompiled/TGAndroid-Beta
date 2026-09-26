package xa;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class b {
    public final String f46010a;
    public final c f46011b;

    public b(Set set, c cVar) {
        this.f46010a = b(set);
        this.f46011b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f46008a);
            sb2.append('/');
            sb2.append(aVar.f46009b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f46010a;
        c cVar = this.f46011b;
        synchronized (((HashSet) cVar.f46014b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f46014b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.u());
    }
}
