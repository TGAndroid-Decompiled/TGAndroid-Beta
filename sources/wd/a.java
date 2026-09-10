package wd;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
public final class a implements b {
    public final AtomicReference f43970a;

    public a(e eVar) {
        this.f43970a = new AtomicReference(eVar);
    }

    @Override
    public final Iterator iterator() {
        b bVar = (b) this.f43970a.getAndSet(null);
        if (bVar != null) {
            return bVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
