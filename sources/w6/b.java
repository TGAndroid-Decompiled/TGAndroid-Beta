package w6;

import android.content.Context;
import k6.h;
public final class b {
    public static final b f48044b;
    public h f48045a;

    static {
        ?? obj = new Object();
        obj.f48045a = null;
        f48044b = obj;
    }

    public static h a(Context context) {
        h hVar;
        b bVar = f48044b;
        synchronized (bVar) {
            try {
                if (bVar.f48045a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f48045a = new h(context, 3);
                }
                hVar = bVar.f48045a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }
}
