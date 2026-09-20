package q9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class o implements pa.b {
    public volatile Set f41503a;
    public volatile Set f41504b;

    public final synchronized void a() {
        try {
            for (pa.b bVar : this.f41503a) {
                this.f41504b.add(bVar.get());
            }
            this.f41503a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final Object get() {
        if (this.f41504b == null) {
            synchronized (this) {
                try {
                    if (this.f41504b == null) {
                        this.f41504b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f41504b);
    }
}
