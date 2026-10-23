package r9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class o implements qa.b {
    public volatile Set f45569a;
    public volatile Set f45570b;

    public final synchronized void a() {
        try {
            for (qa.b bVar : this.f45569a) {
                this.f45570b.add(bVar.get());
            }
            this.f45569a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final Object get() {
        if (this.f45570b == null) {
            synchronized (this) {
                try {
                    if (this.f45570b == null) {
                        this.f45570b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f45570b);
    }
}
