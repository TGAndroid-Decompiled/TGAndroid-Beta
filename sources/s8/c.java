package s8;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public class c extends l7.d0 {
    public final Map f47094b;
    public final e0 f47095c;

    public c(e0 e0Var, Map map) {
        super(2);
        this.f47095c = e0Var;
        map.getClass();
        this.f47094b = map;
    }

    @Override
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            l7.c cVar = (l7.c) it;
            if (cVar.hasNext()) {
                cVar.next();
                cVar.remove();
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f47094b.containsKey(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.f47094b.keySet().containsAll(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj && !this.f47094b.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return this.f47094b.keySet().hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.f47094b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new l7.c(this, this.f47094b.entrySet().iterator(), 7);
    }

    @Override
    public final boolean remove(Object obj) {
        int i10;
        Collection collection = (Collection) this.f47094b.remove(obj);
        if (collection != null) {
            i10 = collection.size();
            collection.clear();
            this.f47095c.f47101e -= i10;
        } else {
            i10 = 0;
        }
        if (i10 <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int size() {
        return this.f47094b.size();
    }
}
