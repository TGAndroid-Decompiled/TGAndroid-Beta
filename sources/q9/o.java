package q9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class o implements pa.b {
    public volatile Set f41201a;
    public volatile Set f41202b;

    public final synchronized void a() {
        try {
            for (pa.b bVar : this.f41201a) {
                this.f41202b.add(bVar.get());
            }
            this.f41201a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final Object get() {
        if (this.f41202b == null) {
            synchronized (this) {
                try {
                    if (this.f41202b == null) {
                        this.f41202b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f41202b);
    }
}
