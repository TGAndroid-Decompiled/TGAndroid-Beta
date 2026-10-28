package s9;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;
public final class m implements oa.b, oa.a {
    public final HashMap f48042a = new HashMap();
    public ArrayDeque f48043b = new ArrayDeque();
    public final Executor f48044c;

    public m(Executor executor) {
        this.f48044c = executor;
    }

    public final void a(c2.i iVar) {
        Executor executor = this.f48044c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.f48042a.containsKey(m9.b.class)) {
                    this.f48042a.put(m9.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f48042a.get(m9.b.class)).put(iVar, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
