package r9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class o implements qa.b {
    public volatile Set f45156a;
    public volatile Set f45157b;

    public final synchronized void a() {
        try {
            for (qa.b bVar : this.f45156a) {
                this.f45157b.add(bVar.get());
            }
            this.f45156a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final Object get() {
        if (this.f45157b == null) {
            synchronized (this) {
                try {
                    if (this.f45157b == null) {
                        this.f45157b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f45157b);
    }
}
