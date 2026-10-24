package r9;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;
public final class l implements na.b, na.a {
    public final HashMap f45562a = new HashMap();
    public ArrayDeque f45563b = new ArrayDeque();
    public final Executor f45564c;

    public l(Executor executor) {
        this.f45564c = executor;
    }

    public final void a(c3.m mVar) {
        Executor executor = this.f45564c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.f45562a.containsKey(l9.b.class)) {
                    this.f45562a.put(l9.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f45562a.get(l9.b.class)).put(mVar, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
