package r9;

import bi.w2;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;
public final class l implements na.b, na.a {
    public final HashMap f44050a = new HashMap();
    public ArrayDeque f44051b = new ArrayDeque();
    public final Executor f44052c;

    public l(Executor executor) {
        this.f44052c = executor;
    }

    public final void a(w2 w2Var) {
        Executor executor = this.f44052c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.f44050a.containsKey(l9.b.class)) {
                    this.f44050a.put(l9.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f44050a.get(l9.b.class)).put(w2Var, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
