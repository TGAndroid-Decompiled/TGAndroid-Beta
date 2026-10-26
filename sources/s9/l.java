package s9;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;
public final class l implements oa.b, oa.a {
    public final HashMap f48004a = new HashMap();
    public ArrayDeque f48005b = new ArrayDeque();
    public final Executor f48006c;

    public l(Executor executor) {
        this.f48006c = executor;
    }

    public final void a(c2.i iVar) {
        Executor executor = this.f48006c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.f48004a.containsKey(m9.b.class)) {
                    this.f48004a.put(m9.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f48004a.get(m9.b.class)).put(iVar, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
