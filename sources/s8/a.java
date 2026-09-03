package s8;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class a implements Iterator {
    public final Iterator f44174a;
    public Object f44175b = null;
    public Collection f44176c = null;
    public Iterator d = c0.f44185a;
    public final e0 e;

    public a(e0 e0Var) {
        this.e = e0Var;
        this.f44174a = e0Var.d.entrySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        if (!this.f44174a.hasNext() && !this.d.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f44174a.next();
            this.f44175b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f44176c = collection;
            this.d = collection.iterator();
        }
        return this.d.next();
    }

    @Override
    public final void remove() {
        this.d.remove();
        Collection collection = this.f44176c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f44174a.remove();
        }
        e0 e0Var = this.e;
        e0Var.e--;
    }
}
