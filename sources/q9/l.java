package q9;

import ai.w1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;
public final class l implements ma.b, ma.a {
    public final HashMap f44874a = new HashMap();
    public ArrayDeque f44875b = new ArrayDeque();
    public final Executor f44876c;

    public l(Executor executor) {
        this.f44876c = executor;
    }

    public final void a(w1 w1Var) {
        Executor executor = this.f44876c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.f44874a.containsKey(k9.b.class)) {
                    this.f44874a.put(k9.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f44874a.get(k9.b.class)).put(w1Var, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
