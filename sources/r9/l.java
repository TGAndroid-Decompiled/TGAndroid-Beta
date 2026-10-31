package r9;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;
import th.m1;
public final class l implements na.b, na.a {
    public final HashMap f46442a = new HashMap();
    public ArrayDeque f46443b = new ArrayDeque();
    public final Executor f46444c;

    public l(Executor executor) {
        this.f46444c = executor;
    }

    public final void a(m1 m1Var) {
        Executor executor = this.f46444c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.f46442a.containsKey(l9.b.class)) {
                    this.f46442a.put(l9.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f46442a.get(l9.b.class)).put(m1Var, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
