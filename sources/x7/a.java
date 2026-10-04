package x7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class a extends e9.l1 {
    public final Map f49409b;
    public final f f49410c;

    public a(f fVar, Map map) {
        super(1);
        this.f49410c = fVar;
        map.getClass();
        this.f49409b = map;
    }

    @Override
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            e9.c cVar = (e9.c) it;
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
        return this.f49409b.containsKey(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.f49409b.keySet().containsAll(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj && !this.f49409b.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return this.f49409b.keySet().hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.f49409b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new e9.c(this, this.f49409b.entrySet().iterator(), 5);
    }

    @Override
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f49409b.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f49410c.d -= size;
            if (size > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int size() {
        return this.f49409b.size();
    }
}
