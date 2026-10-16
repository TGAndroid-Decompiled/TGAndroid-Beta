package r9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class o implements qa.b {
    public volatile Set f43815a;
    public volatile Set f43816b;

    public final synchronized void a() {
        try {
            for (qa.b bVar : this.f43815a) {
                this.f43816b.add(bVar.get());
            }
            this.f43815a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final Object get() {
        if (this.f43816b == null) {
            synchronized (this) {
                try {
                    if (this.f43816b == null) {
                        this.f43816b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f43816b);
    }
}
