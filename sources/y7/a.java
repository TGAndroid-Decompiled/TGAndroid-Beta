package y7;

import a8.ta;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class a extends a8.x {
    public final Map f52066b;
    public final e f52067c;

    public a(e eVar, Map map) {
        super(2);
        this.f52067c = eVar;
        map.getClass();
        this.f52066b = map;
    }

    @Override
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            ta taVar = (ta) it;
            if (taVar.hasNext()) {
                taVar.next();
                taVar.remove();
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f52066b.containsKey(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.f52066b.keySet().containsAll(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj && !this.f52066b.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return this.f52066b.keySet().hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.f52066b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new ta(this, this.f52066b.entrySet().iterator(), 8);
    }

    @Override
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f52066b.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f52067c.d -= size;
            if (size > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int size() {
        return this.f52066b.size();
    }
}
