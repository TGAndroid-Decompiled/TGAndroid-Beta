package xa;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class b {
    public final String f49817a;
    public final c f49818b;

    public b(Set set, c cVar) {
        this.f49817a = b(set);
        this.f49818b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f49815a);
            sb2.append('/');
            sb2.append(aVar.f49816b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f49817a;
        c cVar = this.f49818b;
        synchronized (((HashSet) cVar.f49821b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f49821b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.J());
    }
}
