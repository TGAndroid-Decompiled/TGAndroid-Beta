package w7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
public abstract class f5 {
    public static boolean a(a8.x xVar, Collection collection) {
        collection.getClass();
        if (collection instanceof y7.q) {
            collection = ((y7.q) collection).zza();
        }
        boolean z10 = false;
        if ((collection instanceof Set) && collection.size() > xVar.size()) {
            Iterator<E> it = xVar.iterator();
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }
        for (Object obj : collection) {
            z10 |= xVar.remove(obj);
        }
        return z10;
    }
}
