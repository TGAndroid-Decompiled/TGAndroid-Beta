package w6;

import android.content.Context;
import k6.h;
public final class b {
    public static final b f48043b;
    public h f48044a;

    static {
        ?? obj = new Object();
        obj.f48044a = null;
        f48043b = obj;
    }

    public static h a(Context context) {
        h hVar;
        b bVar = f48043b;
        synchronized (bVar) {
            try {
                if (bVar.f48044a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f48044a = new h(context, 3);
                }
                hVar = bVar.f48044a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }
}
