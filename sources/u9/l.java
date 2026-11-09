package u9;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;
public final class l implements ra.b, ra.a {
    public final HashMap f56489a = new HashMap();
    public ArrayDeque f56490b = new ArrayDeque();
    public final Executor f56491c;

    public l(Executor executor) {
        this.f56491c = executor;
    }

    public final void a(a3.l lVar) {
        Executor executor = this.f56491c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.f56489a.containsKey(o9.b.class)) {
                    this.f56489a.put(o9.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f56489a.get(o9.b.class)).put(lVar, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
