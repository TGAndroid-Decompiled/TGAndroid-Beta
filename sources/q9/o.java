package q9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class o implements pa.b {
    public volatile Set f41153a;
    public volatile Set f41154b;

    public final synchronized void a() {
        try {
            for (pa.b bVar : this.f41153a) {
                this.f41154b.add(bVar.get());
            }
            this.f41153a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final Object get() {
        if (this.f41154b == null) {
            synchronized (this) {
                try {
                    if (this.f41154b == null) {
                        this.f41154b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f41154b);
    }
}
