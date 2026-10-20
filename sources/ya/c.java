package ya;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class c {
    public final String f50117a;
    public final d f50118b;

    public c(Set set, d dVar) {
        this.f50117a = b(set);
        this.f50118b = dVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f50114a);
            sb2.append('/');
            sb2.append(aVar.f50115b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f50117a;
        d dVar = this.f50118b;
        synchronized (((HashSet) dVar.f50121b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) dVar.f50121b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(dVar.V());
    }
}
