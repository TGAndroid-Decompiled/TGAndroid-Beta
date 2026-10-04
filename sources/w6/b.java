package w6;

import android.content.Context;
import v0.k;
public final class b {
    public static final b f48590b;
    public k f48591a;

    static {
        ?? obj = new Object();
        obj.f48591a = null;
        f48590b = obj;
    }

    public static k a(Context context) {
        k kVar;
        b bVar = f48590b;
        synchronized (bVar) {
            try {
                if (bVar.f48591a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f48591a = new k(context, 1);
                }
                kVar = bVar.f48591a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kVar;
    }
}
