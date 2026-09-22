package xa;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class b {
    public final String f46052a;
    public final c f46053b;

    public b(Set set, c cVar) {
        this.f46052a = b(set);
        this.f46053b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f46050a);
            sb2.append('/');
            sb2.append(aVar.f46051b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f46052a;
        c cVar = this.f46053b;
        synchronized (((HashSet) cVar.f46056b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f46056b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.v());
    }
}
