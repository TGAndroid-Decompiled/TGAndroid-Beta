package xa;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class b {
    public final String f46119a;
    public final c f46120b;

    public b(Set set, c cVar) {
        this.f46119a = b(set);
        this.f46120b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f46117a);
            sb2.append('/');
            sb2.append(aVar.f46118b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f46119a;
        c cVar = this.f46120b;
        synchronized (((HashSet) cVar.f46123b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f46123b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.u());
    }
}
