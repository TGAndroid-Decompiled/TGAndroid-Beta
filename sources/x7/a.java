package x7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class a extends e9.j2 {
    public final Map f49309b;
    public final f f49310c;

    public a(f fVar, Map map) {
        super(1);
        this.f49310c = fVar;
        map.getClass();
        this.f49309b = map;
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
        return this.f49309b.containsKey(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.f49309b.keySet().containsAll(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj && !this.f49309b.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return this.f49309b.keySet().hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.f49309b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new e9.d(this, this.f49309b.entrySet().iterator(), 5);
    }

    @Override
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f49309b.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f49310c.d -= size;
            if (size > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int size() {
        return this.f49309b.size();
    }
}
