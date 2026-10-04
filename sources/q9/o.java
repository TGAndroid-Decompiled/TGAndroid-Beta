package q9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class o implements pa.b {
    public volatile Set f44865a;
    public volatile Set f44866b;

    public final synchronized void a() {
        try {
            for (pa.b bVar : this.f44865a) {
                this.f44866b.add(bVar.get());
            }
            this.f44865a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final Object get() {
        if (this.f44866b == null) {
            synchronized (this) {
                try {
                    if (this.f44866b == null) {
                        this.f44866b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f44866b);
    }
}
