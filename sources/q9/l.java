package q9;

import ai.w1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;
public final class l implements ma.b, ma.a {
    public final HashMap f41456a = new HashMap();
    public ArrayDeque f41457b = new ArrayDeque();
    public final Executor f41458c;

    public l(Executor executor) {
        this.f41458c = executor;
    }

    public final void a(w1 w1Var) {
        Executor executor = this.f41458c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.f41456a.containsKey(k9.b.class)) {
                    this.f41456a.put(k9.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f41456a.get(k9.b.class)).put(w1Var, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
