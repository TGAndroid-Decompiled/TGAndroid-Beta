package s9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class o implements ra.b {
    public volatile Set f48010a;
    public volatile Set f48011b;

    public final synchronized void a() {
        try {
            for (ra.b bVar : this.f48010a) {
                this.f48011b.add(bVar.get());
            }
            this.f48010a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final Object get() {
        if (this.f48011b == null) {
            synchronized (this) {
                try {
                    if (this.f48011b == null) {
                        this.f48011b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f48011b);
    }
}
