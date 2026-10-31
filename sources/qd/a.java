package qd;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
public final class a implements b {
    public final AtomicReference f45510a;

    public a(e eVar) {
        this.f45510a = new AtomicReference(eVar);
    }

    @Override
    public final Iterator iterator() {
        b bVar = (b) this.f45510a.getAndSet(null);
        if (bVar != null) {
            return bVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
