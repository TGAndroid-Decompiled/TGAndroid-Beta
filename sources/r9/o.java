package r9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class o implements qa.b {
    public volatile Set f44056a;
    public volatile Set f44057b;

    public final synchronized void a() {
        try {
            for (qa.b bVar : this.f44056a) {
                this.f44057b.add(bVar.get());
            }
            this.f44056a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final Object get() {
        if (this.f44057b == null) {
            synchronized (this) {
                try {
                    if (this.f44057b == null) {
                        this.f44057b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f44057b);
    }
}
