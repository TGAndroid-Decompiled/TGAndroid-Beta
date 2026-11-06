package u9;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;
public final class k implements ra.b, ra.a {
    public final HashMap f56360a = new HashMap();
    public ArrayDeque f56361b = new ArrayDeque();
    public final Executor f56362c;

    public k(Executor executor) {
        this.f56362c = executor;
    }

    public final void a(a3.l lVar) {
        Executor executor = this.f56362c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.f56360a.containsKey(o9.b.class)) {
                    this.f56360a.put(o9.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f56360a.get(o9.b.class)).put(lVar, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
