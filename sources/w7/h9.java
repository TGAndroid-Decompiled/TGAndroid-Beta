package w7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
public abstract class h9 {
    public static boolean a(e9.l1 l1Var, Collection collection) {
        collection.getClass();
        if (collection instanceof z7.l) {
            collection = ((z7.l) collection).zza();
        }
        boolean z10 = false;
        if ((collection instanceof Set) && collection.size() > l1Var.size()) {
            Iterator<E> it = l1Var.iterator();
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }
        for (Object obj : collection) {
            z10 |= l1Var.remove(obj);
        }
        return z10;
    }
}
