package u9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class n implements ua.b {
    public volatile Set f58681a;
    public volatile Set f58682b;

    public final synchronized void a() {
        try {
            for (ua.b bVar : this.f58681a) {
                this.f58682b.add(bVar.get());
            }
            this.f58681a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final Object get() {
        if (this.f58682b == null) {
            synchronized (this) {
                try {
                    if (this.f58682b == null) {
                        this.f58682b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f58682b);
    }
}
