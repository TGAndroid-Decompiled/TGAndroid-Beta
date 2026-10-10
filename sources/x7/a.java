package x7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class a extends e9.l1 {
    public final Map f50736b;
    public final f f50737c;

    public a(f fVar, Map map) {
        super(1);
        this.f50737c = fVar;
        map.getClass();
        this.f50736b = map;
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
        return this.f50736b.containsKey(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.f50736b.keySet().containsAll(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj && !this.f50736b.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return this.f50736b.keySet().hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.f50736b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new e9.c(this, this.f50736b.entrySet().iterator(), 5);
    }

    @Override
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f50736b.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f50737c.d -= size;
            if (size > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int size() {
        return this.f50736b.size();
    }
}
