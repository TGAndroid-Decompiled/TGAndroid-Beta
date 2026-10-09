package xa;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class c {
    public final String f51101a;
    public final d f51102b;

    public c(Set set, d dVar) {
        this.f51101a = b(set);
        this.f51102b = dVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f51098a);
            sb2.append('/');
            sb2.append(aVar.f51099b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f51101a;
        d dVar = this.f51102b;
        synchronized (((HashSet) dVar.f51105b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) dVar.f51105b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(dVar.l());
    }
}
