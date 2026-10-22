package ya;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class c {
    public final String f50120a;
    public final d f50121b;

    public c(Set set, d dVar) {
        this.f50120a = b(set);
        this.f50121b = dVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f50117a);
            sb2.append('/');
            sb2.append(aVar.f50118b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f50120a;
        d dVar = this.f50121b;
        synchronized (((HashSet) dVar.f50124b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) dVar.f50124b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(dVar.V());
    }
}
