package r9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class o implements qa.b {
    public volatile Set f45157a;
    public volatile Set f45158b;

    public final synchronized void a() {
        try {
            for (qa.b bVar : this.f45157a) {
                this.f45158b.add(bVar.get());
            }
            this.f45157a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final Object get() {
        if (this.f45158b == null) {
            synchronized (this) {
                try {
                    if (this.f45158b == null) {
                        this.f45158b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f45158b);
    }
}
