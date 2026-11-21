package u9;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;
public final class k implements ra.b, ra.a {
    public final HashMap f58591a = new HashMap();
    public ArrayDeque f58592b = new ArrayDeque();
    public final Executor f58593c;

    public k(Executor executor) {
        this.f58593c = executor;
    }

    public final void a(a3.l lVar) {
        Executor executor = this.f58593c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.f58591a.containsKey(o9.b.class)) {
                    this.f58591a.put(o9.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f58591a.get(o9.b.class)).put(lVar, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
