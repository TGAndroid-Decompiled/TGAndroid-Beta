package xa;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class b {
    public final String f46057a;
    public final c f46058b;

    public b(Set set, c cVar) {
        this.f46057a = b(set);
        this.f46058b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f46055a);
            sb2.append('/');
            sb2.append(aVar.f46056b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f46057a;
        c cVar = this.f46058b;
        synchronized (((HashSet) cVar.f46061b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f46061b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.t());
    }
}
