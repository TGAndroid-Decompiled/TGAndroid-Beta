package q8;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public class c extends j7.d0 {
    public final Map f46437b;
    public final h0 f46438c;

    public c(h0 h0Var, Map map) {
        super(2);
        this.f46438c = h0Var;
        map.getClass();
        this.f46437b = map;
    }

    @Override
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            j7.c cVar = (j7.c) it;
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
        return this.f46437b.containsKey(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.f46437b.keySet().containsAll(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj && !this.f46437b.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return this.f46437b.keySet().hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.f46437b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new j7.c(this, this.f46437b.entrySet().iterator(), 7);
    }

    @Override
    public final boolean remove(Object obj) {
        int i10;
        Collection collection = (Collection) this.f46437b.remove(obj);
        if (collection != null) {
            i10 = collection.size();
            collection.clear();
            this.f46438c.f46453e -= i10;
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
        return this.f46437b.size();
    }
}
