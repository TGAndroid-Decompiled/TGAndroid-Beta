package r9;

import bi.w2;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;
public final class l implements na.b, na.a {
    public final HashMap f43809a = new HashMap();
    public ArrayDeque f43810b = new ArrayDeque();
    public final Executor f43811c;

    public l(Executor executor) {
        this.f43811c = executor;
    }

    public final void a(w2 w2Var) {
        Executor executor = this.f43811c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.f43809a.containsKey(l9.b.class)) {
                    this.f43809a.put(l9.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f43809a.get(l9.b.class)).put(w2Var, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
