package r9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class o implements qa.b {
    public volatile Set f45153a;
    public volatile Set f45154b;

    public final synchronized void a() {
        try {
            for (qa.b bVar : this.f45153a) {
                this.f45154b.add(bVar.get());
            }
            this.f45153a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final Object get() {
        if (this.f45154b == null) {
            synchronized (this) {
                try {
                    if (this.f45154b == null) {
                        this.f45154b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f45154b);
    }
}
