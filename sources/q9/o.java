package q9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class o implements pa.b {
    public volatile Set f41462a;
    public volatile Set f41463b;

    public final synchronized void a() {
        try {
            for (pa.b bVar : this.f41462a) {
                this.f41463b.add(bVar.get());
            }
            this.f41462a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final Object get() {
        if (this.f41463b == null) {
            synchronized (this) {
                try {
                    if (this.f41463b == null) {
                        this.f41463b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f41463b);
    }
}
