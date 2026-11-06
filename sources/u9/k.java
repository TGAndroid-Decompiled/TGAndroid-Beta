package u9;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;
public final class k implements ra.b, ra.a {
    public final HashMap f56384a = new HashMap();
    public ArrayDeque f56385b = new ArrayDeque();
    public final Executor f56386c;

    public k(Executor executor) {
        this.f56386c = executor;
    }

    public final void a(a3.l lVar) {
        Executor executor = this.f56386c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.f56384a.containsKey(o9.b.class)) {
                    this.f56384a.put(o9.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f56384a.get(o9.b.class)).put(lVar, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
