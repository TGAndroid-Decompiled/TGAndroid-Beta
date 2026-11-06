package u9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class n implements ua.b {
    public volatile Set f56366a;
    public volatile Set f56367b;

    public final synchronized void a() {
        try {
            for (ua.b bVar : this.f56366a) {
                this.f56367b.add(bVar.get());
            }
            this.f56366a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final Object get() {
        if (this.f56367b == null) {
            synchronized (this) {
                try {
                    if (this.f56367b == null) {
                        this.f56367b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f56367b);
    }
}
