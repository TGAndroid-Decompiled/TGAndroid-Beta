package u9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class n implements ua.b {
    public volatile Set f56391a;
    public volatile Set f56392b;

    public final synchronized void a() {
        try {
            for (ua.b bVar : this.f56391a) {
                this.f56392b.add(bVar.get());
            }
            this.f56391a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final Object get() {
        if (this.f56392b == null) {
            synchronized (this) {
                try {
                    if (this.f56392b == null) {
                        this.f56392b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f56392b);
    }
}
