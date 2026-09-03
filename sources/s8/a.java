package s8;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class a implements Iterator {
    public final Iterator f47114a;
    public Object f47115b = null;
    public Collection f47116c = null;
    public Iterator d = c0.f47127a;
    public final e0 f47117e;

    public a(e0 e0Var) {
        this.f47117e = e0Var;
        this.f47114a = e0Var.d.entrySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        if (!this.f47114a.hasNext() && !this.d.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f47114a.next();
            this.f47115b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f47116c = collection;
            this.d = collection.iterator();
        }
        return this.d.next();
    }

    @Override
    public final void remove() {
        this.d.remove();
        Collection collection = this.f47116c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f47114a.remove();
        }
        e0 e0Var = this.f47117e;
        e0Var.f47132e--;
    }
}
