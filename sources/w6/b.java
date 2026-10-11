package w6;

import android.content.Context;
import k6.h;
public final class b {
    public static final b f50011b;
    public h f50012a;

    static {
        ?? obj = new Object();
        obj.f50012a = null;
        f50011b = obj;
    }

    public static h a(Context context) {
        h hVar;
        b bVar = f50011b;
        synchronized (bVar) {
            try {
                if (bVar.f50012a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f50012a = new h(context, 4);
                }
                hVar = bVar.f50012a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }
}
