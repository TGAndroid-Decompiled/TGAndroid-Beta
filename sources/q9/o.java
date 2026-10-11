package q9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class o implements pa.b {
    public volatile Set f46111a;
    public volatile Set f46112b;

    public final synchronized void a() {
        try {
            for (pa.b bVar : this.f46111a) {
                this.f46112b.add(bVar.get());
            }
            this.f46111a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final Object get() {
        if (this.f46112b == null) {
            synchronized (this) {
                try {
                    if (this.f46112b == null) {
                        this.f46112b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f46112b);
    }
}
