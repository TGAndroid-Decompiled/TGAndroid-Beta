package s8;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class a implements Iterator {
    public final Iterator f47083a;
    public Object f47084b = null;
    public Collection f47085c = null;
    public Iterator d = c0.f47096a;
    public final e0 f47086e;

    public a(e0 e0Var) {
        this.f47086e = e0Var;
        this.f47083a = e0Var.d.entrySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        if (!this.f47083a.hasNext() && !this.d.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f47083a.next();
            this.f47084b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f47085c = collection;
            this.d = collection.iterator();
        }
        return this.d.next();
    }

    @Override
    public final void remove() {
        this.d.remove();
        Collection collection = this.f47085c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f47083a.remove();
        }
        e0 e0Var = this.f47086e;
        e0Var.f47101e--;
    }
}
