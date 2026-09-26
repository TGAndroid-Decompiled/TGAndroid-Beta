package w6;

import android.content.Context;
import k6.h;
public final class b {
    public static final b f44877b;
    public h f44878a;

    static {
        ?? obj = new Object();
        obj.f44878a = null;
        f44877b = obj;
    }

    public static h a(Context context) {
        h hVar;
        b bVar = f44877b;
        synchronized (bVar) {
            try {
                if (bVar.f44878a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f44878a = new h(context, (short) 0);
                }
                hVar = bVar.f44878a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }
}
