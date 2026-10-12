package q9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class o implements pa.b {
    public volatile Set f45981a;
    public volatile Set f45982b;

    public final synchronized void a() {
        try {
            for (pa.b bVar : this.f45981a) {
                this.f45982b.add(bVar.get());
            }
            this.f45981a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final Object get() {
        if (this.f45982b == null) {
            synchronized (this) {
                try {
                    if (this.f45982b == null) {
                        this.f45982b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f45982b);
    }
}
