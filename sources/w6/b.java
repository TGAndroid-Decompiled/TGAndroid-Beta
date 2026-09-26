package w6;

import android.content.Context;
import k6.h;
public final class b {
    public static final b f44878b;
    public h f44879a;

    static {
        ?? obj = new Object();
        obj.f44879a = null;
        f44878b = obj;
    }

    public static h a(Context context) {
        h hVar;
        b bVar = f44878b;
        synchronized (bVar) {
            try {
                if (bVar.f44879a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f44879a = new h(context, (short) 0);
                }
                hVar = bVar.f44879a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }
}
