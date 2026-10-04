package w6;

import android.content.Context;
import v0.k;
public final class b {
    public static final b f48589b;
    public k f48590a;

    static {
        ?? obj = new Object();
        obj.f48590a = null;
        f48589b = obj;
    }

    public static k a(Context context) {
        k kVar;
        b bVar = f48589b;
        synchronized (bVar) {
            try {
                if (bVar.f48590a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f48590a = new k(context, 1);
                }
                kVar = bVar.f48590a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kVar;
    }
}
