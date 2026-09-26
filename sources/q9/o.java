package q9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class o implements pa.b {
    public volatile Set f41489a;
    public volatile Set f41490b;

    public final synchronized void a() {
        try {
            for (pa.b bVar : this.f41489a) {
                this.f41490b.add(bVar.get());
            }
            this.f41489a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final Object get() {
        if (this.f41490b == null) {
            synchronized (this) {
                try {
                    if (this.f41490b == null) {
                        this.f41490b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f41490b);
    }
}
