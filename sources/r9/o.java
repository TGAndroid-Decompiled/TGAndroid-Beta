package r9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class o implements qa.b {
    public volatile Set f46448a;
    public volatile Set f46449b;

    public final synchronized void a() {
        try {
            for (qa.b bVar : this.f46448a) {
                this.f46449b.add(bVar.get());
            }
            this.f46448a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final Object get() {
        if (this.f46449b == null) {
            synchronized (this) {
                try {
                    if (this.f46449b == null) {
                        this.f46449b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f46449b);
    }
}
