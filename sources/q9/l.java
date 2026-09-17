package q9;

import androidx.emoji2.text.w;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;
public final class l implements ma.b, ma.a {
    public final HashMap f44261a = new HashMap();
    public ArrayDeque f44262b = new ArrayDeque();
    public final Executor f44263c;

    public l(Executor executor) {
        this.f44263c = executor;
    }

    public final void a(w wVar) {
        Executor executor = this.f44263c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.f44261a.containsKey(k9.b.class)) {
                    this.f44261a.put(k9.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f44261a.get(k9.b.class)).put(wVar, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
