package ya;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class b {
    public final String f50560a;
    public final c f50561b;

    public b(Set set, c cVar) {
        this.f50560a = b(set);
        this.f50561b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f50558a);
            sb2.append('/');
            sb2.append(aVar.f50559b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f50560a;
        c cVar = this.f50561b;
        synchronized (((HashSet) cVar.f50564b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f50564b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.V());
    }
}
