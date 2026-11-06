package u9;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;
public final class k implements ra.b, ra.a {
    public final HashMap f56385a = new HashMap();
    public ArrayDeque f56386b = new ArrayDeque();
    public final Executor f56387c;

    public k(Executor executor) {
        this.f56387c = executor;
    }

    public final void a(a3.l lVar) {
        Executor executor = this.f56387c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.f56385a.containsKey(o9.b.class)) {
                    this.f56385a.put(o9.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f56385a.get(o9.b.class)).put(lVar, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
