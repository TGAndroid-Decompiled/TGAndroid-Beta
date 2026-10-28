package za;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class b {
    public final String f52898a;
    public final c f52899b;

    public b(Set set, c cVar) {
        this.f52898a = b(set);
        this.f52899b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f52896a);
            sb2.append('/');
            sb2.append(aVar.f52897b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f52898a;
        c cVar = this.f52899b;
        synchronized (((HashSet) cVar.f52902b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f52902b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.O());
    }
}
