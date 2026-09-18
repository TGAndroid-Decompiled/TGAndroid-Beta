package w6;

import android.content.Context;
import v0.k;
public final class b {
    public static final b f44625b;
    public k f44626a;

    static {
        ?? obj = new Object();
        obj.f44626a = null;
        f44625b = obj;
    }

    public static k a(Context context) {
        k kVar;
        b bVar = f44625b;
        synchronized (bVar) {
            try {
                if (bVar.f44626a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f44626a = new k(context, 1);
                }
                kVar = bVar.f44626a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kVar;
    }
}
