package z8;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public final class n implements y9.b {

    public volatile Set f50247a;

    public volatile Set f50248b;

    public final synchronized void a() {
        try {
            Iterator it = this.f50247a.iterator();
            while (it.hasNext()) {
                this.f50248b.add(((y9.b) it.next()).get());
            }
            this.f50247a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override
    public final Object get() {
        if (this.f50248b == null) {
            synchronized (this) {
                try {
                    if (this.f50248b == null) {
                        this.f50248b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f50248b);
    }
}
