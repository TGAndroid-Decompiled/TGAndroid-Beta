package xa;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class b {
    public final String f49824a;
    public final c f49825b;

    public b(Set set, c cVar) {
        this.f49824a = b(set);
        this.f49825b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f49822a);
            sb2.append('/');
            sb2.append(aVar.f49823b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f49824a;
        c cVar = this.f49825b;
        synchronized (((HashSet) cVar.f49828b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f49828b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.I());
    }
}
