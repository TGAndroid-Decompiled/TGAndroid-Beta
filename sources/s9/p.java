package s9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class p implements ra.b {
    public volatile Set f48048a;
    public volatile Set f48049b;

    public final synchronized void a() {
        try {
            for (ra.b bVar : this.f48048a) {
                this.f48049b.add(bVar.get());
            }
            this.f48048a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final Object get() {
        if (this.f48049b == null) {
            synchronized (this) {
                try {
                    if (this.f48049b == null) {
                        this.f48049b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f48049b);
    }
}
