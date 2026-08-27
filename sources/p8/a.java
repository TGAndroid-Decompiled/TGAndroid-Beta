package p8;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class a implements Iterator {

    public final Iterator f45519a;

    public Object f45520b = null;

    public Collection f45521c = null;
    public Iterator d = f0.f45542a;

    public final h0 f45522e;

    public a(h0 h0Var) {
        this.f45522e = h0Var;
        this.f45519a = h0Var.d.entrySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        return this.f45519a.hasNext() || this.d.hasNext();
    }

    @Override
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f45519a.next();
            this.f45520b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f45521c = collection;
            this.d = collection.iterator();
        }
        return this.d.next();
    }

    @Override
    public final void remove() {
        this.d.remove();
        Collection collection = this.f45521c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f45519a.remove();
        }
        this.f45522e.f45546e--;
    }
}
