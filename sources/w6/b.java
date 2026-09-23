package w6;

import android.content.Context;
import v0.k;
public final class b {
    public static final b f44547b;
    public k f44548a;

    static {
        ?? obj = new Object();
        obj.f44548a = null;
        f44547b = obj;
    }

    public static k a(Context context) {
        k kVar;
        b bVar = f44547b;
        synchronized (bVar) {
            try {
                if (bVar.f44548a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f44548a = new k(context, 1);
                }
                kVar = bVar.f44548a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kVar;
    }
}
