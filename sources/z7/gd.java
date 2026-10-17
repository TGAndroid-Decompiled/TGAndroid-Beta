package z7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class gd extends e9.j2 {
    public final Map f50827b;
    public final ng f50828c;

    public gd(ng ngVar, Map map) {
        super(2);
        this.f50828c = ngVar;
        map.getClass();
        this.f50827b = map;
    }

    @Override
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            e9.d dVar = (e9.d) it;
            if (dVar.hasNext()) {
                dVar.next();
                dVar.remove();
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f50827b.containsKey(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.f50827b.keySet().containsAll(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj && !this.f50827b.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return this.f50827b.keySet().hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.f50827b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new e9.d(this, this.f50827b.entrySet().iterator(), 7);
    }

    @Override
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f50827b.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f50828c.getClass();
            if (size > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int size() {
        return this.f50827b.size();
    }
}
