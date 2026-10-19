package ya;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class c {
    public final String f50112a;
    public final d f50113b;

    public c(Set set, d dVar) {
        this.f50112a = b(set);
        this.f50113b = dVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f50109a);
            sb2.append('/');
            sb2.append(aVar.f50110b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f50112a;
        d dVar = this.f50113b;
        synchronized (((HashSet) dVar.f50116b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) dVar.f50116b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(dVar.V());
    }
}
