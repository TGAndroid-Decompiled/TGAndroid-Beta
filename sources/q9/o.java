package q9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class o implements pa.b {
    public volatile Set f41524a;
    public volatile Set f41525b;

    public final synchronized void a() {
        try {
            for (pa.b bVar : this.f41524a) {
                this.f41525b.add(bVar.get());
            }
            this.f41524a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final Object get() {
        if (this.f41525b == null) {
            synchronized (this) {
                try {
                    if (this.f41525b == null) {
                        this.f41525b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f41525b);
    }
}
