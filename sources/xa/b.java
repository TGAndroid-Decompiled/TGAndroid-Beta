package xa;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class b {
    public final String f45729a;
    public final c f45730b;

    public b(Set set, c cVar) {
        this.f45729a = b(set);
        this.f45730b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f45727a);
            sb2.append('/');
            sb2.append(aVar.f45728b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f45729a;
        c cVar = this.f45730b;
        synchronized (((HashSet) cVar.f45733b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f45733b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.q());
    }
}
