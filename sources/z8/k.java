package z8;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;

public final class k implements v9.b, v9.a {

    public final HashMap f50241a = new HashMap();

    public ArrayDeque f50242b = new ArrayDeque();

    public final Executor f50243c;

    public k(Executor executor) {
        this.f50243c = executor;
    }

    public final void a(a9.m mVar) {
        Executor executor = this.f50243c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.f50241a.containsKey(t8.b.class)) {
                    this.f50241a.put(t8.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f50241a.get(t8.b.class)).put(mVar, executor);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
