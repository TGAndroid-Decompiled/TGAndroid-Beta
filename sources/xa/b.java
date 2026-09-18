package xa;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class b {
    public final String f45761a;
    public final c f45762b;

    public b(Set set, c cVar) {
        this.f45761a = b(set);
        this.f45762b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f45759a);
            sb2.append('/');
            sb2.append(aVar.f45760b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f45761a;
        c cVar = this.f45762b;
        synchronized (((HashSet) cVar.f45765b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f45765b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.q());
    }
}
