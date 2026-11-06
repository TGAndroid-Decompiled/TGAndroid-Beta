package u9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class n implements ua.b {
    public volatile Set f56390a;
    public volatile Set f56391b;

    public final synchronized void a() {
        try {
            for (ua.b bVar : this.f56390a) {
                this.f56391b.add(bVar.get());
            }
            this.f56390a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final Object get() {
        if (this.f56391b == null) {
            synchronized (this) {
                try {
                    if (this.f56391b == null) {
                        this.f56391b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f56391b);
    }
}
