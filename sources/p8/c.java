package p8;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class c extends i7.d0 {

    public final Map f45530b;

    public final h0 f45531c;

    public c(h0 h0Var, Map map) {
        super(2);
        this.f45531c = h0Var;
        map.getClass();
        this.f45530b = map;
    }

    @Override
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            i7.c cVar = (i7.c) it;
            if (!cVar.hasNext()) {
                return;
            }
            cVar.next();
            cVar.remove();
        }
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f45530b.containsKey(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.f45530b.keySet().containsAll(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        return this == obj || this.f45530b.keySet().equals(obj);
    }

    @Override
    public final int hashCode() {
        return this.f45530b.keySet().hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.f45530b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new i7.c(this, this.f45530b.entrySet().iterator(), 7);
    }

    @Override
    public final boolean remove(Object obj) {
        int size;
        Collection collection = (Collection) this.f45530b.remove(obj);
        if (collection != null) {
            size = collection.size();
            collection.clear();
            this.f45531c.f45546e -= size;
        } else {
            size = 0;
        }
        return size > 0;
    }

    @Override
    public final int size() {
        return this.f45530b.size();
    }
}
