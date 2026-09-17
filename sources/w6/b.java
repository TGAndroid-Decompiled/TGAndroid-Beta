package w6;

import android.content.Context;
import v0.k;
public final class b {
    public static final b f44620b;
    public k f44621a;

    static {
        ?? obj = new Object();
        obj.f44621a = null;
        f44620b = obj;
    }

    public static k a(Context context) {
        k kVar;
        b bVar = f44620b;
        synchronized (bVar) {
            try {
                if (bVar.f44621a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f44621a = new k(context, 1);
                }
                kVar = bVar.f44621a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kVar;
    }
}
