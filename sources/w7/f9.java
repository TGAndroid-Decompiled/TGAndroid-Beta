package w7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
public abstract class f9 {
    public static boolean a(e9.j2 j2Var, Collection collection) {
        collection.getClass();
        if (collection instanceof z7.l) {
            collection = ((z7.l) collection).zza();
        }
        boolean z10 = false;
        if ((collection instanceof Set) && collection.size() > j2Var.size()) {
            Iterator<E> it = j2Var.iterator();
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }
        for (Object obj : collection) {
            z10 |= j2Var.remove(obj);
        }
        return z10;
    }
}
