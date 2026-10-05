package z7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class ed extends e9.l1 {
    public final Map f52541b;
    public final lg f52542c;

    public ed(lg lgVar, Map map) {
        super(2);
        this.f52542c = lgVar;
        map.getClass();
        this.f52541b = map;
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
        return this.f52541b.containsKey(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.f52541b.keySet().containsAll(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj && !this.f52541b.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return this.f52541b.keySet().hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.f52541b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new e9.c(this, this.f52541b.entrySet().iterator(), 7);
    }

    @Override
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f52541b.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f52542c.getClass();
            if (size > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int size() {
        return this.f52541b.size();
    }
}
