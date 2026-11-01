package r9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class o implements qa.b {
    public volatile Set f46459a;
    public volatile Set f46460b;

    public final synchronized void a() {
        try {
            for (qa.b bVar : this.f46459a) {
                this.f46460b.add(bVar.get());
            }
            this.f46459a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final Object get() {
        if (this.f46460b == null) {
            synchronized (this) {
                try {
                    if (this.f46460b == null) {
                        this.f46460b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f46460b);
    }
}
