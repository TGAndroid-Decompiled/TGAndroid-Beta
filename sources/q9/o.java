package q9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class o implements pa.b {
    public volatile Set f44267a;
    public volatile Set f44268b;

    public final synchronized void a() {
        try {
            for (pa.b bVar : this.f44267a) {
                this.f44268b.add(bVar.get());
            }
            this.f44267a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final Object get() {
        if (this.f44268b == null) {
            synchronized (this) {
                try {
                    if (this.f44268b == null) {
                        this.f44268b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f44268b);
    }
}
