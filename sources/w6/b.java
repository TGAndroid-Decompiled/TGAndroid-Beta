package w6;

import android.content.Context;
import l5.j;
public final class b {
    public static final b f49034b;
    public j f49035a;

    static {
        ?? obj = new Object();
        obj.f49035a = null;
        f49034b = obj;
    }

    public static j a(Context context) {
        j jVar;
        b bVar = f49034b;
        synchronized (bVar) {
            try {
                if (bVar.f49035a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f49035a = new j(context, 3);
                }
                jVar = bVar.f49035a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jVar;
    }
}
