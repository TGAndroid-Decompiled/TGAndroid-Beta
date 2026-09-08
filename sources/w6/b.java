package w6;

import android.content.Context;
import k6.h;
public final class b {
    public static final b f48072b;
    public h f48073a;

    static {
        ?? obj = new Object();
        obj.f48073a = null;
        f48072b = obj;
    }

    public static h a(Context context) {
        h hVar;
        b bVar = f48072b;
        synchronized (bVar) {
            try {
                if (bVar.f48073a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f48073a = new h(context, 3);
                }
                hVar = bVar.f48073a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }
}
