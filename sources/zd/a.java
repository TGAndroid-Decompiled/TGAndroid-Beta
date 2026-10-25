package zd;

import ae.j;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
public final class a implements b {
    public final AtomicReference f52846a;

    public a(j jVar) {
        this.f52846a = new AtomicReference(jVar);
    }

    @Override
    public final Iterator iterator() {
        b bVar = (b) this.f52846a.getAndSet(null);
        if (bVar != null) {
            return bVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
