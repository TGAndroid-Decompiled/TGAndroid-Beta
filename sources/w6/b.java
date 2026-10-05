package w6;

import android.content.Context;
import v0.k;
public final class b {
    public static final b f48605b;
    public k f48606a;

    static {
        ?? obj = new Object();
        obj.f48606a = null;
        f48605b = obj;
    }

    public static k a(Context context) {
        k kVar;
        b bVar = f48605b;
        synchronized (bVar) {
            try {
                if (bVar.f48606a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f48606a = new k(context, 1);
                }
                kVar = bVar.f48606a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kVar;
    }
}
