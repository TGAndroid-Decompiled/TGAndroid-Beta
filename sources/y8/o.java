package y8;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class o implements x9.b {
    public volatile Set f49651a;
    public volatile Set f49652b;

    public final synchronized void a() {
        try {
            for (x9.b bVar : this.f49651a) {
                this.f49652b.add(bVar.get());
            }
            this.f49651a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override
    public final Object get() {
        if (this.f49652b == null) {
            synchronized (this) {
                try {
                    if (this.f49652b == null) {
                        this.f49652b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f49652b);
    }
}
