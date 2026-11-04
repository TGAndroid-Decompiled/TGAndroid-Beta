package t9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class o implements ta.b {
    public volatile Set f55070a;
    public volatile Set f55071b;

    public final synchronized void a() {
        try {
            for (ta.b bVar : this.f55070a) {
                this.f55071b.add(bVar.get());
            }
            this.f55070a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final Object get() {
        if (this.f55071b == null) {
            synchronized (this) {
                try {
                    if (this.f55071b == null) {
                        this.f55071b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f55071b);
    }
}
