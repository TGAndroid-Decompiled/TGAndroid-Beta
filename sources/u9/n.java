package u9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class n implements ua.b {
    public volatile Set f58555a;
    public volatile Set f58556b;

    public final synchronized void a() {
        try {
            for (ua.b bVar : this.f58555a) {
                this.f58556b.add(bVar.get());
            }
            this.f58555a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final Object get() {
        if (this.f58556b == null) {
            synchronized (this) {
                try {
                    if (this.f58556b == null) {
                        this.f58556b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f58556b);
    }
}
