package u9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class o implements ua.b {
    public volatile Set f56495a;
    public volatile Set f56496b;

    public final synchronized void a() {
        try {
            for (ua.b bVar : this.f56495a) {
                this.f56496b.add(bVar.get());
            }
            this.f56495a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final Object get() {
        if (this.f56496b == null) {
            synchronized (this) {
                try {
                    if (this.f56496b == null) {
                        this.f56496b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f56496b);
    }
}
