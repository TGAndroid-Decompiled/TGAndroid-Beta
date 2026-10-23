package z7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class fd extends e9.j2 {
    public final Map f50806b;
    public final mg f50807c;

    public fd(mg mgVar, Map map) {
        super(2);
        this.f50807c = mgVar;
        map.getClass();
        this.f50806b = map;
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
        return this.f50806b.containsKey(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.f50806b.keySet().containsAll(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj && !this.f50806b.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return this.f50806b.keySet().hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.f50806b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new e9.d(this, this.f50806b.entrySet().iterator(), 7);
    }

    @Override
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f50806b.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f50807c.getClass();
            if (size > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int size() {
        return this.f50806b.size();
    }
}
