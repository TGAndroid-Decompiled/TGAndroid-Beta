package ya;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class c {
    public final String f50110a;
    public final d f50111b;

    public c(Set set, d dVar) {
        this.f50110a = b(set);
        this.f50111b = dVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f50107a);
            sb2.append('/');
            sb2.append(aVar.f50108b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f50110a;
        d dVar = this.f50111b;
        synchronized (((HashSet) dVar.f50114b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) dVar.f50114b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(dVar.V());
    }
}
