package q9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class o implements pa.b {
    public volatile Set f44880a;
    public volatile Set f44881b;

    public final synchronized void a() {
        try {
            for (pa.b bVar : this.f44880a) {
                this.f44881b.add(bVar.get());
            }
            this.f44880a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final Object get() {
        if (this.f44881b == null) {
            synchronized (this) {
                try {
                    if (this.f44881b == null) {
                        this.f44881b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f44881b);
    }
}
