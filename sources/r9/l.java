package r9;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;
public final class l implements na.b, na.a {
    public final HashMap f45563a = new HashMap();
    public ArrayDeque f45564b = new ArrayDeque();
    public final Executor f45565c;

    public l(Executor executor) {
        this.f45565c = executor;
    }

    public final void a(c3.m mVar) {
        Executor executor = this.f45565c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.f45563a.containsKey(l9.b.class)) {
                    this.f45563a.put(l9.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f45563a.get(l9.b.class)).put(mVar, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
