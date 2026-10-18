package r9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class o implements qa.b {
    public volatile Set f45191a;
    public volatile Set f45192b;

    public final synchronized void a() {
        try {
            for (qa.b bVar : this.f45191a) {
                this.f45192b.add(bVar.get());
            }
            this.f45191a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final Object get() {
        if (this.f45192b == null) {
            synchronized (this) {
                try {
                    if (this.f45192b == null) {
                        this.f45192b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f45192b);
    }
}
