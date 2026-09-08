package q9;

import androidx.emoji2.text.w;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;
public final class l implements ma.b, ma.a {
    public final HashMap f44260a = new HashMap();
    public ArrayDeque f44261b = new ArrayDeque();
    public final Executor f44262c;

    public l(Executor executor) {
        this.f44262c = executor;
    }

    public final void a(w wVar) {
        Executor executor = this.f44262c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.f44260a.containsKey(k9.b.class)) {
                    this.f44260a.put(k9.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f44260a.get(k9.b.class)).put(wVar, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
