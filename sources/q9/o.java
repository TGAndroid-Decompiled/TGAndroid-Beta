package q9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class o implements pa.b {
    public volatile Set f45973a;
    public volatile Set f45974b;

    public final synchronized void a() {
        try {
            for (pa.b bVar : this.f45973a) {
                this.f45974b.add(bVar.get());
            }
            this.f45973a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final Object get() {
        if (this.f45974b == null) {
            synchronized (this) {
                try {
                    if (this.f45974b == null) {
                        this.f45974b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f45974b);
    }
}
