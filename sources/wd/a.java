package wd;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
public final class a implements b {
    public final AtomicReference f45309a;

    public a(e eVar) {
        this.f45309a = new AtomicReference(eVar);
    }

    @Override
    public final Iterator iterator() {
        b bVar = (b) this.f45309a.getAndSet(null);
        if (bVar != null) {
            return bVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
