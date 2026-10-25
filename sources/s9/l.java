package s9;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;
public final class l implements oa.b, oa.a {
    public final HashMap f48001a = new HashMap();
    public ArrayDeque f48002b = new ArrayDeque();
    public final Executor f48003c;

    public l(Executor executor) {
        this.f48003c = executor;
    }

    public final void a(c2.i iVar) {
        Executor executor = this.f48003c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.f48001a.containsKey(m9.b.class)) {
                    this.f48001a.put(m9.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f48001a.get(m9.b.class)).put(iVar, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
