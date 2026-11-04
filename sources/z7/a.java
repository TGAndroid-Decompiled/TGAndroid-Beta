package z7;

import b8.ra;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class a extends b8.x {
    public final Map f59794b;
    public final e f59795c;

    public a(e eVar, Map map) {
        super(2);
        this.f59795c = eVar;
        map.getClass();
        this.f59794b = map;
    }

    @Override
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            ra raVar = (ra) it;
            if (raVar.hasNext()) {
                raVar.next();
                raVar.remove();
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f59794b.containsKey(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.f59794b.keySet().containsAll(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj && !this.f59794b.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return this.f59794b.keySet().hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.f59794b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new ra(this, this.f59794b.entrySet().iterator(), 8);
    }

    @Override
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f59794b.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f59795c.d -= size;
            if (size > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int size() {
        return this.f59794b.size();
    }
}
