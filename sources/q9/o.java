package q9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class o implements pa.b {
    public volatile Set f41228a;
    public volatile Set f41229b;

    public final synchronized void a() {
        try {
            for (pa.b bVar : this.f41228a) {
                this.f41229b.add(bVar.get());
            }
            this.f41228a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final Object get() {
        if (this.f41229b == null) {
            synchronized (this) {
                try {
                    if (this.f41229b == null) {
                        this.f41229b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f41229b);
    }
}
