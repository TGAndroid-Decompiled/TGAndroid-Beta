package u9;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;
public final class k implements ra.b, ra.a {
    public final HashMap f58675a = new HashMap();
    public ArrayDeque f58676b = new ArrayDeque();
    public final Executor f58677c;

    public k(Executor executor) {
        this.f58677c = executor;
    }

    public final void a(a3.l lVar) {
        Executor executor = this.f58677c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.f58675a.containsKey(o9.b.class)) {
                    this.f58675a.put(o9.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f58675a.get(o9.b.class)).put(lVar, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
