package w6;

import android.content.Context;
import v0.k;
public final class b {
    public static final b f48598b;
    public k f48599a;

    static {
        ?? obj = new Object();
        obj.f48599a = null;
        f48598b = obj;
    }

    public static k a(Context context) {
        k kVar;
        b bVar = f48598b;
        synchronized (bVar) {
            try {
                if (bVar.f48599a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f48599a = new k(context, 1);
                }
                kVar = bVar.f48599a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kVar;
    }
}
