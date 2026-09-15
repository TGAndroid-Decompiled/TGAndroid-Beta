package xa;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class b {
    public final String f45733a;
    public final c f45734b;

    public b(Set set, c cVar) {
        this.f45733a = b(set);
        this.f45734b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f45731a);
            sb2.append('/');
            sb2.append(aVar.f45732b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f45733a;
        c cVar = this.f45734b;
        synchronized (((HashSet) cVar.f45737b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f45737b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.q());
    }
}
