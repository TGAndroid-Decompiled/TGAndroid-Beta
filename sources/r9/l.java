package r9;

import ci.i1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;
public final class l implements na.b, na.a {
    public final HashMap f45151a = new HashMap();
    public ArrayDeque f45152b = new ArrayDeque();
    public final Executor f45153c;

    public l(Executor executor) {
        this.f45153c = executor;
    }

    public final void a(i1 i1Var) {
        Executor executor = this.f45153c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.f45151a.containsKey(l9.b.class)) {
                    this.f45151a.put(l9.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f45151a.get(l9.b.class)).put(i1Var, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
