package r9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class o implements qa.b {
    public volatile Set f45145a;
    public volatile Set f45146b;

    public final synchronized void a() {
        try {
            for (qa.b bVar : this.f45145a) {
                this.f45146b.add(bVar.get());
            }
            this.f45145a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final Object get() {
        if (this.f45146b == null) {
            synchronized (this) {
                try {
                    if (this.f45146b == null) {
                        this.f45146b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f45146b);
    }
}
