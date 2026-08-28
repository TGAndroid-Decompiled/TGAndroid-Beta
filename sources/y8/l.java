package y8;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;
public final class l implements u9.b, u9.a {
    public final HashMap f49645a = new HashMap();
    public ArrayDeque f49646b = new ArrayDeque();
    public final Executor f49647c;

    public l(Executor executor) {
        this.f49647c = executor;
    }

    public final void a(a9.b bVar) {
        Executor executor = this.f49647c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.f49645a.containsKey(s8.b.class)) {
                    this.f49645a.put(s8.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f49645a.get(s8.b.class)).put(bVar, executor);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
