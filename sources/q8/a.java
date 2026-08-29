package q8;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class a implements Iterator {
    public final Iterator f46426a;
    public Object f46427b = null;
    public Collection f46428c = null;
    public Iterator d = f0.f46449a;
    public final h0 f46429e;

    public a(h0 h0Var) {
        this.f46429e = h0Var;
        this.f46426a = h0Var.d.entrySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        if (!this.f46426a.hasNext() && !this.d.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f46426a.next();
            this.f46427b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f46428c = collection;
            this.d = collection.iterator();
        }
        return this.d.next();
    }

    @Override
    public final void remove() {
        this.d.remove();
        Collection collection = this.f46428c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f46426a.remove();
        }
        h0 h0Var = this.f46429e;
        h0Var.f46453e--;
    }
}
