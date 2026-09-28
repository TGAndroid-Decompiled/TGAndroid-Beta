package q9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class o implements pa.b {
    public volatile Set f41491a;
    public volatile Set f41492b;

    public final synchronized void a() {
        try {
            for (pa.b bVar : this.f41491a) {
                this.f41492b.add(bVar.get());
            }
            this.f41491a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final Object get() {
        if (this.f41492b == null) {
            synchronized (this) {
                try {
                    if (this.f41492b == null) {
                        this.f41492b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f41492b);
    }
}
