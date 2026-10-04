package xa;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class b {
    public final String f49808a;
    public final c f49809b;

    public b(Set set, c cVar) {
        this.f49808a = b(set);
        this.f49809b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f49806a);
            sb2.append('/');
            sb2.append(aVar.f49807b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f49808a;
        c cVar = this.f49809b;
        synchronized (((HashSet) cVar.f49812b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f49812b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.J());
    }
}
