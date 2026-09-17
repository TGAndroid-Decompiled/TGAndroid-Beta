package w6;

import android.content.Context;
import k6.h;
public final class b {
    public static final b f48073b;
    public h f48074a;

    static {
        ?? obj = new Object();
        obj.f48074a = null;
        f48073b = obj;
    }

    public static h a(Context context) {
        h hVar;
        b bVar = f48073b;
        synchronized (bVar) {
            try {
                if (bVar.f48074a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f48074a = new h(context, 3);
                }
                hVar = bVar.f48074a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }
}
