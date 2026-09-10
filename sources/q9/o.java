package q9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class o implements pa.b {
    public volatile Set f40578a;
    public volatile Set f40579b;

    public final synchronized void a() {
        try {
            for (pa.b bVar : this.f40578a) {
                this.f40579b.add(bVar.get());
            }
            this.f40578a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final Object get() {
        if (this.f40579b == null) {
            synchronized (this) {
                try {
                    if (this.f40579b == null) {
                        this.f40579b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f40579b);
    }
}
