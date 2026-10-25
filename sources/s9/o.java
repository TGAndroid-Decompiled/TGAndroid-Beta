package s9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class o implements ra.b {
    public volatile Set f48007a;
    public volatile Set f48008b;

    public final synchronized void a() {
        try {
            for (ra.b bVar : this.f48007a) {
                this.f48008b.add(bVar.get());
            }
            this.f48007a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final Object get() {
        if (this.f48008b == null) {
            synchronized (this) {
                try {
                    if (this.f48008b == null) {
                        this.f48008b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f48008b);
    }
}
