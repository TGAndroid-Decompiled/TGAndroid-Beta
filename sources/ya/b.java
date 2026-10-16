package ya;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class b {
    public final String f48727a;
    public final c f48728b;

    public b(Set set, c cVar) {
        this.f48727a = b(set);
        this.f48728b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f48725a);
            sb2.append('/');
            sb2.append(aVar.f48726b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f48727a;
        c cVar = this.f48728b;
        synchronized (((HashSet) cVar.f48731b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f48731b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.x0());
    }
}
