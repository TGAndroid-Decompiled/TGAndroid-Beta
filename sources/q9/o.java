package q9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class o implements pa.b {
    public volatile Set f46036a;
    public volatile Set f46037b;

    public final synchronized void a() {
        try {
            for (pa.b bVar : this.f46036a) {
                this.f46037b.add(bVar.get());
            }
            this.f46036a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final Object get() {
        if (this.f46037b == null) {
            synchronized (this) {
                try {
                    if (this.f46037b == null) {
                        this.f46037b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f46037b);
    }
}
