package t9;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;
public final class l implements qa.b, qa.a {
    public final HashMap f55064a = new HashMap();
    public ArrayDeque f55065b = new ArrayDeque();
    public final Executor f55066c;

    public l(Executor executor) {
        this.f55066c = executor;
    }

    public final void a(z9.j jVar) {
        Executor executor = this.f55066c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.f55064a.containsKey(n9.b.class)) {
                    this.f55064a.put(n9.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f55064a.get(n9.b.class)).put(jVar, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
