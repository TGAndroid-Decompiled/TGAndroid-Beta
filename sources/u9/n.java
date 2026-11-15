package u9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class n implements ua.b {
    public volatile Set f57990a;
    public volatile Set f57991b;

    public final synchronized void a() {
        try {
            for (ua.b bVar : this.f57990a) {
                this.f57991b.add(bVar.get());
            }
            this.f57990a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final Object get() {
        if (this.f57991b == null) {
            synchronized (this) {
                try {
                    if (this.f57991b == null) {
                        this.f57991b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f57991b);
    }
}
