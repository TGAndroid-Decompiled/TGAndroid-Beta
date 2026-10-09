package w6;

import android.content.Context;
import k6.h;
public final class b {
    public static final b f49888b;
    public h f49889a;

    static {
        ?? obj = new Object();
        obj.f49889a = null;
        f49888b = obj;
    }

    public static h a(Context context) {
        h hVar;
        b bVar = f49888b;
        synchronized (bVar) {
            try {
                if (bVar.f49889a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f49889a = new h(context, 4);
                }
                hVar = bVar.f49889a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }
}
