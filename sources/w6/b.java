package w6;

import android.content.Context;
import k6.h;
public final class b {
    public static final b f44864b;
    public h f44865a;

    static {
        ?? obj = new Object();
        obj.f44865a = null;
        f44864b = obj;
    }

    public static h a(Context context) {
        h hVar;
        b bVar = f44864b;
        synchronized (bVar) {
            try {
                if (bVar.f44865a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f44865a = new h(context, (short) 0);
                }
                hVar = bVar.f44865a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }
}
