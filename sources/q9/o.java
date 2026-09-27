package q9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class o implements pa.b {
    public volatile Set f41520a;
    public volatile Set f41521b;

    public final synchronized void a() {
        try {
            for (pa.b bVar : this.f41520a) {
                this.f41521b.add(bVar.get());
            }
            this.f41520a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final Object get() {
        if (this.f41521b == null) {
            synchronized (this) {
                try {
                    if (this.f41521b == null) {
                        this.f41521b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f41521b);
    }
}
