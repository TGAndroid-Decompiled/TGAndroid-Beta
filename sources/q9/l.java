package q9;

import androidx.emoji2.text.w;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;
public final class l implements ma.b, ma.a {
    public final HashMap f40572a = new HashMap();
    public ArrayDeque f40573b = new ArrayDeque();
    public final Executor f40574c;

    public l(Executor executor) {
        this.f40574c = executor;
    }

    public final void a(w wVar) {
        Executor executor = this.f40574c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.f40572a.containsKey(k9.b.class)) {
                    this.f40572a.put(k9.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f40572a.get(k9.b.class)).put(wVar, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
