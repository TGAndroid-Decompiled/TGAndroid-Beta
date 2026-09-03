package s8;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public class c extends l7.d0 {
    public final Map f44183b;
    public final e0 f44184c;

    public c(e0 e0Var, Map map) {
        super(2);
        this.f44184c = e0Var;
        map.getClass();
        this.f44183b = map;
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
        return this.f44183b.containsKey(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.f44183b.keySet().containsAll(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj && !this.f44183b.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return this.f44183b.keySet().hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.f44183b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new l7.c(this, this.f44183b.entrySet().iterator(), 7);
    }

    @Override
    public final boolean remove(Object obj) {
        int i10;
        Collection collection = (Collection) this.f44183b.remove(obj);
        if (collection != null) {
            i10 = collection.size();
            collection.clear();
            this.f44184c.e -= i10;
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
        return this.f44183b.size();
    }
}
