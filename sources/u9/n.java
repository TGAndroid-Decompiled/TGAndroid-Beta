package u9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class n implements ua.b {
    public volatile Set f58597a;
    public volatile Set f58598b;

    public final synchronized void a() {
        try {
            for (ua.b bVar : this.f58597a) {
                this.f58598b.add(bVar.get());
            }
            this.f58597a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final Object get() {
        if (this.f58598b == null) {
            synchronized (this) {
                try {
                    if (this.f58598b == null) {
                        this.f58598b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f58598b);
    }
}
