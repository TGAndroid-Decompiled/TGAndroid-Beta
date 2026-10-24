package ya;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class b {
    public final String f50559a;
    public final c f50560b;

    public b(Set set, c cVar) {
        this.f50559a = b(set);
        this.f50560b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f50557a);
            sb2.append('/');
            sb2.append(aVar.f50558b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f50559a;
        c cVar = this.f50560b;
        synchronized (((HashSet) cVar.f50563b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f50563b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.V());
    }
}
