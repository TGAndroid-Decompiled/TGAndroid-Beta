package w6;

import android.content.Context;
import l5.j;
public final class b {
    public static final b f49035b;
    public j f49036a;

    static {
        ?? obj = new Object();
        obj.f49036a = null;
        f49035b = obj;
    }

    public static j a(Context context) {
        j jVar;
        b bVar = f49035b;
        synchronized (bVar) {
            try {
                if (bVar.f49036a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f49036a = new j(context, 3);
                }
                jVar = bVar.f49036a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jVar;
    }
}
