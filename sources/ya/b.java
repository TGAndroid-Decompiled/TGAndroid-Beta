package ya;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class b {
    public final String f50157a;
    public final c f50158b;

    public b(Set set, c cVar) {
        this.f50157a = b(set);
        this.f50158b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f50155a);
            sb2.append('/');
            sb2.append(aVar.f50156b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f50157a;
        c cVar = this.f50158b;
        synchronized (((HashSet) cVar.f50161b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f50161b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.T());
    }
}
