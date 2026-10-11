package q9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class o implements pa.b {
    public volatile Set f46145a;
    public volatile Set f46146b;

    public final synchronized void a() {
        try {
            for (pa.b bVar : this.f46145a) {
                this.f46146b.add(bVar.get());
            }
            this.f46145a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final Object get() {
        if (this.f46146b == null) {
            synchronized (this) {
                try {
                    if (this.f46146b == null) {
                        this.f46146b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f46146b);
    }
}
