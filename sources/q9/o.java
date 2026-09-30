package q9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class o implements pa.b {
    public volatile Set f41492a;
    public volatile Set f41493b;

    public final synchronized void a() {
        try {
            for (pa.b bVar : this.f41492a) {
                this.f41493b.add(bVar.get());
            }
            this.f41492a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final Object get() {
        if (this.f41493b == null) {
            synchronized (this) {
                try {
                    if (this.f41493b == null) {
                        this.f41493b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f41493b);
    }
}
